# albeepoint-mapper

Spring Boot + MyBatis Generator 기반의 재사용용 mapper 모듈 예제입니다.

이 프로젝트에는 아래가 포함되어 있습니다.

- MariaDB 실제 테이블 기반 Model / Mapper / XML 생성
- `tables.txt` 만 수정하면 `generatorConfig.xml` 자동 생성
- 생성 코드는 `src/main/java/com/albee/albeepoint/mapper/{table}` 아래에 테이블별 폴더로 생성
- `mvn clean install` 후 다른 프로젝트에서 의존성 또는 서브모듈로 재사용 가능

## 구조

```text
albeepoint-mapper
├─ pom.xml
├─ generate.sh
├─ scripts/generate-generator-config.sh
├─ src/main/resources/generator
│  ├─ generator.properties
│  ├─ tables.txt
│  └─ generatorConfig.xml   # 스크립트로 자동 생성됨
└─ src/main/java/com/albee/albeepoint/mapper
   ├─ cont_org
   │  ├─ ContOrg.java
   │  ├─ ContOrgExample.java
   │  ├─ ContOrgMapper.java
   │  └─ ContOrgMapper.xml
   └─ cont_mst
      ├─ ContMst.java
      ├─ ContMstExample.java
      ├─ ContMstMapper.java
      └─ ContMstMapper.xml
```

## 테이블 목록만 수정하는 방식

`src/main/resources/generator/tables.txt`

```text
cont_org
cont_mst
# customer
# product
```

한 줄에 테이블명 하나씩 적으면 됩니다.

## generator.properties

생성 경로와 공통 패키지 prefix는 여기서 관리합니다.

```properties
base.java.package=com.albee.albeepoint.mapper
base.xml.path=com/albee/albeepoint/mapper
java.targetProject=src/main/java
resources.targetProject=src/main/java
```

즉, Java model / Mapper interface / Mapper XML 이 모두 같은 테이블 폴더 아래 생성됩니다.

## 실행 순서

### 1) generatorConfig.xml 자동 생성

```bash
./scripts/generate-generator-config.sh
```

### 2) 코드 생성

```bash
mvn -U clean generate-sources
```

또는 한 번에:

```bash
./generate.sh
```

## 생성 결과 예시

`tables.txt` 에 `cont_org` 를 넣으면 아래처럼 생성됩니다.

```text
src/main/java/com/albee/albeepoint/mapper/cont_org/ContOrg.java
src/main/java/com/albee/albeepoint/mapper/cont_org/ContOrgExample.java
src/main/java/com/albee/albeepoint/mapper/cont_org/ContOrgMapper.java
src/main/java/com/albee/albeepoint/mapper/cont_org/ContOrgMapper.xml
```

## install 해서 다른 프로젝트에서 쓰기

```bash
./generate.sh
mvn clean install
```

그 다음 다른 프로젝트의 `pom.xml` 에서:

```xml
<dependency>
    <groupId>com.albee</groupId>
    <artifactId>albeepoint-mapper</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

다른 프로젝트에서는 보통 아래 설정을 추가합니다.

```java
@MapperScan("com.albee.albeepoint.mapper")
```

```yaml
mybatis:
  mapper-locations: classpath*:com/albee/albeepoint/mapper/**/*.xml
```

## 주의

- `generatorConfig.xml` 은 직접 편집하지 않고 스크립트로 다시 생성하는 것을 권장합니다.
- 새로운 테이블을 추가할 때는 `tables.txt` 에만 추가한 뒤 `./generate.sh` 를 실행하면 됩니다.
- DB 접속 정보는 `generator.properties` 에 있습니다.
- XML도 `src/main/java` 아래에 생성되므로, `pom.xml` 에서 해당 XML이 jar에 포함되도록 resource 설정을 추가해 두었습니다.
