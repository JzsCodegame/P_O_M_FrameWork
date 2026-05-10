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
