package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.Page_setting;
import util.Browser;

public class Categories {

WebDriver driver;
@Test
public void categories_test	() throws InterruptedException {
	
	driver=  Browser.browser_setting();
	 Page_setting add_cat= PageFactory.initElements((WebDriver) driver, Page_setting.class);
	 add_cat.add_categories();

	 add_cat.submit();
	 add_cat.swictch_window();
	 add_cat.navigate_back();
	 add_cat.select_month();
	 driver.close();	 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
