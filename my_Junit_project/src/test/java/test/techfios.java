package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageFactory.Toggle_box;
import util.Browser;

public class techfios {

	 WebDriver driver;
	@Test
	public void toggle () throws InterruptedException {
		driver=Browser.browser_setting();
		
		Toggle_box	Toggle_box= PageFactory.initElements((WebDriver) driver,Toggle_box.class);
		Toggle_box.toggleBoxes();
		Toggle_box.clickToggleBox2();
		Toggle_box.remove_single();
		Toggle_box.delete_box();
		Toggle_box.click_all();
		Toggle_box.remove_all();
		
		
		
	}	
}
