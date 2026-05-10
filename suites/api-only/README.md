# API-only execution variation

This folder is a dedicated variation that runs only API tests.

## Run commands

- Using profile:
  ```bash
  mvn test -Papi-only
  ```

- Override suite file directly:
  ```bash
  mvn test -DsuiteXmlFile=suites/api-only/testng-api-only.xml
  ```

## Shareable Eclipse run configuration (no manual setup)

A preconfigured Eclipse Maven launch file is checked in:

- `eclipse-run-configs/API-Only-Maven.launch`

Import it in Eclipse:

1. `Run` -> `Run Configurations...`
2. Right-click `Maven Build` -> `Import...`
3. Select `eclipse-run-configs/API-Only-Maven.launch`
4. Run `API-Only-Maven`

This runs:

- Goal: `test`
- Profile: `api-only`
