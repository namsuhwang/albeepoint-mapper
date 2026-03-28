#!/usr/bin/env bash
set -euo pipefail
DIR="$(cd "$(dirname "$0")" && pwd)"
"$DIR/scripts/generate-generator-config.sh"
mvn -U clean generate-sources
