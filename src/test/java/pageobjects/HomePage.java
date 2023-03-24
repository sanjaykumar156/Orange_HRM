package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy (xpath ="//h6[normalize-space()='Dashboard']")
	WebElement checktext;
	
	@FindBy (xpath ="//span[@class='oxd-userdropdown-tab']")
	WebElement clkprofile;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnlogout;
	
	
	//methods
	public boolean dashboard() {
		try {
			return (checktext.isDisplayed());	
			}catch (Exception e){
				return (false);
			}
	}
	
	public void buttonclick() {
		clkprofile.click();
	}
	
	public void logout() {
		btnlogout.click();
	}

}
