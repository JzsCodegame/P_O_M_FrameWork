# Selenium-all execution variation

This folder runs all TestNG tests under the `seleniumTestMethods` package.

## Run commands

- Using profile:
  ```bash
  mvn test -Pselenium-all
  ```

- Override suite file directly:
  ```bash
  mvn test -DsuiteXmlFile=suites/selenium-all/testng-selenium-all.xml
  ```

## Run a single Selenium class (without changing `pom.xml`)

If you want one class only (for example `Actions1`), use:

```bash
mvn test -Dtest=seleniumTestMethods.Actions1
```

In Eclipse Maven Run Configuration:

- Goals: `test`
- Profiles: *(leave blank for single-class run)*
- Parameter Name: `test`
- Value: `seleniumTestMethods.Actions1`

> Note: do **not** append `-Dtest=...` directly to the Goals text field unless your Eclipse version supports it consistently. Use the parameter table for reliability.
