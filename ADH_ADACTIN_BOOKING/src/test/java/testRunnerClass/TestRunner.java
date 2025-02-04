package testRunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
				features = {"src/test/resources"},
				glue = {"StepDef_Adactin", "hooks"},
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "json:target/cucumber.json", 
									"html:target/htmlreport.html"},
				tags = "@All_Scenarios",
				dryRun = true,
				monochrome = false
				)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
