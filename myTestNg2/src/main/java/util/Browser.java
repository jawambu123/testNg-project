package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
 static WebDriver driver;

	public static WebDriver browser_setting () {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\njewa\\eclipse-workspace\\myTestNg\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();

		driver.get("http://techfios.com/test/101/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	
	

}
