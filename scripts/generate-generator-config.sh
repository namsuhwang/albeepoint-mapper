#!/usr/bin/env bash
set -euo pipefail

BASE_DIR="$(cd "$(dirname "$0")/.." && pwd)"
GEN_DIR="$BASE_DIR/src/main/resources/generator"
TABLES_FILE="${1:-$GEN_DIR/tables.txt}"
OUTPUT_FILE="$GEN_DIR/generatorConfig.xml"
PROPERTIES_RESOURCE="generator/generator.properties"
JAVA_TARGET_PROJECT='${java.targetProject}'
RES_TARGET_PROJECT='${resources.targetProject}'
BASE_JAVA_PACKAGE='${base.java.package}'
BASE_XML_PATH='${base.xml.path}'

if [[ ! -f "$TABLES_FILE" ]]; then
  echo "[ERROR] tables file not found: $TABLES_FILE" >&2
  exit 1
fi

pascal_case() {
  local input="$1"
  awk -F'_' '{
    for (i=1; i<=NF; i++) {
      $i = toupper(substr($i,1,1)) substr($i,2)
    }
    gsub(/ /, "")
    print
  }' <<< "$input"
}

{
  cat <<HEADER
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "https://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">
<generatorConfiguration>

    <properties resource="$PROPERTIES_RESOURCE"/>
HEADER

  while IFS= read -r raw || [[ -n "$raw" ]]; do
    table="$(echo "$raw" | sed 's/#.*$//' | xargs)"
    [[ -z "$table" ]] && continue
    domain="$(pascal_case "$table")"
    ctx="${domain}Context"
    cat <<CONTEXT

    <context id="$ctx" targetRuntime="MyBatis3" defaultModelType="flat">
        <property name="javaFileEncoding" value="UTF-8"/>
        <property name="beginningDelimiter" value="0"/>
        <property name="endingDelimiter" value="0"/>

        <plugin type="org.mybatis.generator.plugins.SerializablePlugin"/>
        <plugin type="org.mybatis.generator.plugins.ToStringPlugin"/>
        <plugin type="org.mybatis.generator.plugins.MapperAnnotationPlugin"/>
        <plugin type="org.mybatis.generator.plugins.UnmergeableXmlMappersPlugin"/>
        <plugin type="org.mybatis.generator.plugins.IgnoreViewsPlugin"/>

        <commentGenerator>
            <property name="suppressDate" value="true"/>
            <property name="suppressAllComments" value="true"/>
        </commentGenerator>

        <jdbcConnection driverClass="\${jdbc.driverClass}"
                        connectionURL="\${jdbc.connectionURL}"
                        userId="\${jdbc.userId}"
                        password="\${jdbc.password}">
            <property name="useInformationSchema" value="true"/>
            <property name="nullCatalogMeansCurrent" value="true"/>
        </jdbcConnection>

        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
            <property name="useJSR310Types" value="true"/>
        </javaTypeResolver>

        <javaModelGenerator targetPackage="$BASE_JAVA_PACKAGE.$table"
                            targetProject="$JAVA_TARGET_PROJECT">
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>

        <sqlMapGenerator targetPackage="$BASE_XML_PATH/$table"
                         targetProject="$RES_TARGET_PROJECT"/>

        <javaClientGenerator type="XMLMAPPER"
                             targetPackage="$BASE_JAVA_PACKAGE.$table"
                             targetProject="$JAVA_TARGET_PROJECT"/>

        <table tableName="$table" domainObjectName="$domain"/>
    </context>
CONTEXT
  done < "$TABLES_FILE"

  cat <<'FOOTER'

</generatorConfiguration>
FOOTER
} > "$OUTPUT_FILE"

python3 - <<'PY' "$OUTPUT_FILE"
from pathlib import Path
import sys
p = Path(sys.argv[1])
s = p.read_text(encoding='utf-8')
s = s.replace('\u00060', '`')
p.write_text(s, encoding='utf-8')
PY

echo "[INFO] generated: $OUTPUT_FILE"
