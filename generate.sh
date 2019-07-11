#!/bin/sh

java -jar openapi-generator-cli.jar generate \
  -g java -i jparker-openapi.json \
  --api-package com.aouziel.jparker.client.api \
  --model-package com.aouziel.jparker.client.model \
  --invoker-package com.aouziel.jparker.client.invoker \
  --group-id com.aouziel \
  --artifact-id jparker-cli \
  --artifact-version 1.0.0 \
  --skip-validate-spec