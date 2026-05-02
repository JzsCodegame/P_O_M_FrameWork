# P_O_M_Framework

Selenium + TestNG automation framework using a Page Object Model (POM) style for web UI tests.

## What application is being tested?

This repository is primarily automating flows on:

1. **Automation Practice**: `https://automationexercise.com/`
   - This is the main application under test for sign-in / sign-up style examples.
2. **Color Street registration page**: `https://www.colorstreet.com/home/account/register`
   - Used by additional page-model/test classes for registration-related coverage.

Base URLs are configured in `BaseClass` and shared by tests inheriting from it.

## Pages involved in the current framework

At a high level, the framework covers a **navigation page → authentication page → registration form page** path.

### 1) Home / Store Landing Page
- Typical entry point for tests.
- Main behavior: load app and click **Sign in**.
- Relevant classes:
  - `pageModel.SignINForm` (PageFactory style)
  - `pageModel.SignInPage` (By-locator style)

### 2) Authentication / Sign-In Entry Page
- Opened after clicking Sign in from the landing page.
- Main behavior: validate page title and route to account creation.
- Relevant classes:
  - `pageModel.SignINForm`
  - `TestModel.SignupTestcase` (`Test_SignUp_Appears`)

### 3) Create Account / Sign-Up Form Page
- Accepts user profile fields (email, first name, last name, password, and related form controls).
- Relevant classes:
  - `pageModel.SignUPForm` (PageFactory)
  - `pageModel.SignInformPage` (non-PageFactory variant)
  - `TestModel.SignupTestcase` (`Fill_SignUp_Form`)

### 4) Optional/alternate coverage pages
- Additional selenium method examples (alerts, frames, drag/drop, date picker, tables, uploads) are provided under:
  - `src/main/java/seleniumTestMethods/`

## How the framework works (high level)

1. **Suite starts** through Maven + TestNG XML.
2. `BaseClass` sets up browser drivers and shared test state.
3. Test classes in `TestModel` execute user flows.
4. Page object classes in `pageModel` perform UI interactions.
5. Assertions validate expected outcomes.
6. TestNG listeners/retry (if configured in suite XML) handle failures.
7. Reports are written to `test-output/`.

For a deeper sequence view, see `PROCESS_FLOW.md`.

## How to run tests

## Prerequisites
- Java + Maven installed.
- Browser available (Chrome expected by default setup).
- Internet access for dependency and driver resolution.

### Run default suite

```bash
mvn test
```

By default, Surefire points to `SignupTestcase.xml`.

### Compile only

```bash
mvn -DskipTests compile
```

### Clean and run

```bash
mvn clean test
```

## How to execute only one page flow (high level approach)

If you want to execute a single page-specific flow, there are two practical options.

### Option A (recommended): dedicated suite XML for one class

Create a lightweight TestNG suite that includes only the class for the page flow you want.

Example: run only the sign-up page flow class.

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="SinglePageSuite">
  <test name="SignupOnly">
    <classes>
      <class name="TestModel.SignupTestcase"/>
    </classes>
  </test>
</suite>
```

Then either:
- run from IDE TestNG runner, or
- temporarily point Surefire `suiteXmlFiles` in `pom.xml` to this suite and run `mvn test`.

### Option B: single test method (for focused debugging)

Run one method from a test class (depends on local Maven/TestNG setup):

```bash
mvn -Dtest=TestModel.SignupTestcase#Test_SignUp_Appears test
```

Use this when debugging one page action quickly.

## Important note about page dependencies

Even when you "test one page," many flows still depend on previous pages.

Example:
- To validate fields on the sign-up form page, test code still needs to:
  1. open the landing page,
  2. click Sign in,
  3. transition into account-creation flow.

So "single-page execution" in UI automation often means:
- **single business flow focus**, not always direct deep-link isolation.

## How we use framework components together

- **Base layer (`basemodel`)**: browser lifecycle and shared driver.
- **Test layer (`TestModel`)**: scenario orchestration and assertions.
- **Page layer (`pageModel`)**: reusable UI operations and selectors.
- **Utility layer (`operations`, `framework`, data providers)**: object repository, keyword actions, and parameterized execution.
- **Suite layer (XML files)**: controls grouping, listeners, retries, and parallel behavior.

## Reporting and how to view outputs

After execution, open:

- `test-output/index.html`
- `test-output/emailable-report.html`
- `test-output/testng-results.xml`
- `test-output/junitreports/TEST-*.xml`

Linux example:

```bash
xdg-open test-output/index.html
xdg-open test-output/emailable-report.html
```

Screenshots available in the repository include:

- `path/screenshot1.png`
- `path/screenshot2.png`
- `yourpath/screenshot3.png`

## Known caveats

- Chrome is initialized by default in `BaseClass`; Firefox/Edge lines are present but commented.
- Some suite XML/class references are legacy and may require cleanup before execution.
- `readobject` currently expects `src/Objectrepo/repo1.properties`, while an existing properties file lives at `src/main/java/framework/repo1.properties`.


## Cucumber API testing (new)

This repository now includes a starter Cucumber + TestNG API smoke flow.

### Files added
- Feature: `src/test/resources/features/api_smoke.feature`
- Step definitions: `src/test/java/api/steps/ApiStepDefinitions.java`
- Cucumber runner: `src/test/java/api/runner/ApiCucumberTestRunner.java`
- TestNG suite for API cucumber: `api-cucumber.xml`

### What it validates
- Sends a GET request to `https://automationexercise.com/api/productsList`.
- Validates HTTP status code.
- Validates that response JSON includes the products list payload.

### How to execute only the API cucumber flow

Option 1 (recommended): temporarily point Surefire suite to `api-cucumber.xml` in `pom.xml` and run:

```bash
mvn test
```

Option 2 (IDE): run `ApiCucumberTestRunner` directly as a TestNG test.

Generated Cucumber outputs (when run successfully):
- `target/cucumber-reports/`
- `target/cucumber.json`
