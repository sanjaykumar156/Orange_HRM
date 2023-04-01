package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

	public ContactPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy(linkText = "My Info")
	WebElement btnmyinfo;
	
	@FindBy(linkText ="Contact Details")
	WebElement btncontact;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement txtstreet1;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement txtstreet2;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	WebElement txtcity;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement txtstate;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	WebElement txtpostal;
	
	@FindBy(xpath ="//div[@class='oxd-select-text oxd-select-text--active']")
	WebElement clkselect;
	
	@FindBy(xpath ="//div[@role='option']//span")
	List<WebElement> countries;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement txtmobile;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")
	WebElement txtemail;
	
	@FindBy(xpath ="//button[normalize-space()='Save']")
	WebElement btnsave;
	
	
	//methods
	
	public void myinfo() {
		btnmyinfo.click();
	}
	
	public void contactdetails() {
		btncontact.click();
	}
	public void street1(String st1) {
		txtstreet1.sendKeys(st1);
	}
	public void street2(String st2) {
		txtstreet2.sendKeys(st2);
	}
	
	public void city(String city) {
		txtcity.sendKeys(city);
	}
	
	public void state(String state) {
		txtstate.sendKeys(state);
	}
	
	public void postal(String postal) {
		txtpostal.sendKeys(postal);
	}
	public void select() {
		clkselect.click();
	}
	public List<WebElement> country(){
		return countries;
	}
	
	public void mobile(String mobile) {
		txtmobile.sendKeys(mobile);
	}
	public void email(String email) {
		txtemail.sendKeys(email);
	}
	
	public void savebtn() {
		btnsave.click();
	}

}
