package testRunner_SauceDemo;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = { "src/test/resources/feature09_filterValidation.feature" }, 
				glue = { "StepDefinition_SauceDemo", "hooks" }, 
				// tags = "@All_Scenario",
				plugin = { "pretty", "json:target/cucumber.json", 
									"html:target/cucumber.html" }, 
				dryRun = false,
				monochrome = false
				)
public class TestRunnerSauceDemo extends AbstractTestNGCucumberTests {
 
	
	
}
