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
