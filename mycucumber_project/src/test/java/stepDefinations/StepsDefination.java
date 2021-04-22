package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Change_Backgrounds;
import util.BrowserFactory;

public class StepsDefination {
	static WebDriver driver;
	@Given("User is on the Techfios home page")
	public void user_is_on_the_techfios_home_page() {
		driver = BrowserFactory.browsersetting();
	    
	}
	@When("user clicks on skyblue background")
	public void user_clicks_on_skyblue_background() throws InterruptedException {
		Change_Backgrounds backgrounds = PageFactory.initElements(driver, Change_Backgrounds.class);
		backgrounds.set_color();
		Thread.sleep(3000);
	}
	@Then("User clicks on white background")
	public void user_clicks_on_white_background() throws InterruptedException {
		Change_Backgrounds backgrounds = PageFactory.initElements(driver, Change_Backgrounds.class);
		backgrounds.change_white();
		Thread.sleep(3000);
		
	}
	@Then("close the browser")
	public void close_the_browser() {
	driver.close();	
	driver.quit();
	  
	}



}
