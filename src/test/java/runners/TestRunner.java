package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        dryRun = true
)
public class TestRunner {
}
