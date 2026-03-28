@echo off
bash scripts/generate-generator-config.sh
mvn -U clean generate-sources
