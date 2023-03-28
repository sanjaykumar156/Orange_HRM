package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage{

	public CheckboxPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']//parent::span")
	List<WebElement> checkbox;
	
	@FindBy(xpath = "//button[normalize-space()='Delete Selected']")
	WebElement delete;
	
	
	
	//methods
	
	public List<WebElement> check(){
		return checkbox;
	}
	
	public void deleteclick() {
		delete.click();
	}

}
