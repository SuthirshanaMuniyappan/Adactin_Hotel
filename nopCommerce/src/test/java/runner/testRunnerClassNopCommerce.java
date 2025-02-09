package runner;
//import org.junit.runner.RunWith;
//import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features ={"src/test/resources"},
		glue = {"stepDefition", "hooks"},
	    tags = "@All_scenario", 
		plugin = {"pretty", "json:target/cucumber.json", 
							"html:target/cucumber.html"},
		dryRun = true
		) 
public class testRunnerClassNopCommerce extends AbstractTestNGCucumberTests{
	
	
	
}
