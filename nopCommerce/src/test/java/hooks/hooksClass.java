package hooks;
import org.openqa.selenium.chrome.ChromeDriver;
import driver.driverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass extends driverInstance {
	
	@Before
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		}
	
	@After
	public void quitBrowser() {
		driver.quit();
	}
}
