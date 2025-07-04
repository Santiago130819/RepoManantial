package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // src/test/resources/features
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepsDefinition")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@LOGIN")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber.html")
@ConfigurationParameter(key = "cucumber.execution.monochrome", value = "true")
public class TestRunner {
}
