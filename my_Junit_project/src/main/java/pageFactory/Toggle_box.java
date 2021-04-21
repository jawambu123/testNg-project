package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Toggle_box {
	
public 	Toggle_box() {
	
	this.driver= driver;
}
	

	WebDriver driver;
	@FindBy(how = How.ID_OR_NAME, using ="allbox") WebElement click_tooglebox;
	@FindBy(how = How.ID_OR_NAME, using ="todo[5]") WebElement todo_5;
	@FindBy(how = How.ID_OR_NAME, using ="submit") WebElement remove;
	
	public void toggleBoxes () {
		click_tooglebox.click();		
	}
	public void clickToggleBox2() {
		click_tooglebox.click();	
	}
	public void remove_single () {
		 todo_5.click();
	}
	public void delete_box() {
          remove.click();
	}	
	public void click_all () {
		click_tooglebox.click();	
	}
	public void remove_all () {
		 remove.click();
	}
	
}
