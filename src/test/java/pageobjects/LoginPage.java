package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txtusername;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement clkbtn;
	
	//methods
	public void username(String username) {
		txtusername.sendKeys(username);
	}
	
	public void password(String password) {
		txtpassword.sendKeys(password);
	}
	
	public void button() {
		clkbtn.click();
	}

}
