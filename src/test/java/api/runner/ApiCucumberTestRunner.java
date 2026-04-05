package api.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "api.steps" },
        tags = { "@api" },
        plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber.json" },
        monochrome = true)
public class ApiCucumberTestRunner extends AbstractTestNGCucumberTests {
}
