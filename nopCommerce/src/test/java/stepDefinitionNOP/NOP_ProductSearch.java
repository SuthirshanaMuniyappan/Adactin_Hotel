package stepDefinitionNOP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver.driverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NOP_ProductSearch extends driverInstance{
	@Given("User should be in NopCommerce home page")
	public void user_should_be_in_nop_commerce_home_page() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("suthirshana.muniyappan@expleogroup.com");
		driver.findElement(By.id("Password")).sendKeys("Suthir@2024");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
	}

	@When("User navigate to Apparel and select shoes")
	public void user_navigate_to_apparel_and_select_shoes() throws InterruptedException {
		
		Actions act	= new Actions(driver);
		WebElement product = driver.findElement(By.xpath("(//a[text()='Apparel '])[1]"));
		act.moveToElement(product);
		Thread.sleep(5000);
		
		
		
	       
	}

	@When("User select the shoe model and press add to card")
	public void user_select_the_shoe_model_and_press_add_to_card() {
	   driver.findElement(By.xpath("(//a[text()='Shoes '])[1]")).click();   
	       
	}

	@Then("User select size and colour")
	public void user_select_size_and_colour() {
	      
	       
	}



}
