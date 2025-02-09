package stepDefinitionNOP;

import org.openqa.selenium.By;
import driver.driverInstance;
import io.cucumber.java.en.*;

public class NOP_Login extends driverInstance {
	
	@Given("User is on the NOP Commerce login page")
	public void user_is_on_the_nop_commerce_login_page() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Login Successfully"+currentUrl);   
	}
	@When("User should login with {string} and {string}")
	public void user_should_login_with_and(String Email, String Password) {
		driver.findElement(By.id("Email")).sendKeys(Email);
		driver.findElement(By.id("Password")).sendKeys(Password);  
	}
	@When("User clicks the remember me button")
	public void user_clicks_the_remember_me_button() {
		driver.findElement(By.id("RememberMe")).click();       
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//button[text()='Log in']")).click();    
	}
	

}
