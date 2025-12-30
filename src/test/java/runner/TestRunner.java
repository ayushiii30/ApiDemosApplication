package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        monochrome = true,
//        tags = "@SmokeTest",
        plugin = {"pretty"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}
