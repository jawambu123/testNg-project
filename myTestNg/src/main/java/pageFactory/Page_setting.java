package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Page_setting {

	public Page_setting() {
		this.driver = driver;
	}

	WebDriver driver;

	@FindBy(how = How.ID_OR_NAME, using = "categorydata")
	WebElement add;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement submit;
	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement error;
	@FindBy(how = How.LINK_TEXT, using = "Nevermind")
	WebElement navigate;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement month_dropdown;

	public void add_categories() {
		add.sendKeys("webcat");

	}

	public void submit() {
		submit.click();
	}

	public void swictch_window() {

		System.out.println(error.getText());
	}

	public void navigate_back() throws InterruptedException {
		Thread.sleep(3000);
		navigate.click();

	}

	public void select_month() throws InterruptedException {
		Select month = new Select(month_dropdown);
		List<WebElement> dd_options = month.getOptions();
		int i = 1;
		for (WebElement e : dd_options) {
			System.out.println(i + "." + e.getText());
			i++;

		}

	}

}
