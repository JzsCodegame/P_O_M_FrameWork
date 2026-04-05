package api.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "api.steps" },
        tags = { "@api" },
        plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber.json" },
        monochrome = true)
public class ApiCucumberTestRunner extends AbstractTestNGCucumberTests {
}
