package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/resources/F02_ProductSearch.feature"},
		glue = {"stepDefinitionNOP", "hooks"},
	    tags = "@All_Scenarios", 
		plugin = {"pretty", "json:target/cucumber.json", 
							"html:target/cucumber.html"},
		snippets = SnippetType.UNDERSCORE,
		dryRun = false
		) 
public class testRunnerClassNopCommerce extends AbstractTestNGCucumberTests{
	
	
	
}