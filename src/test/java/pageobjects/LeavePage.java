package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage extends BasePage {

	public LeavePage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy(linkText ="Leave")
	WebElement leaveclk;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div[1]/input")
	WebElement fromdate;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']")
	WebElement monthclk; 
	
	@FindBy(xpath ="//li[@class='oxd-calendar-dropdown--option']|//li[@class='oxd-calendar-dropdown--option --selected']")
	List<WebElement> monthele;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']")
	WebElement yearclk;
	
	@FindBy(xpath ="//li[@class='oxd-calendar-dropdown--option']")
	List<WebElement> yearele;
	
	@FindBy(xpath ="//div[@class='oxd-calendar-date'] |//div[@class ='--holiday-full oxd-calendar-date --selected']")
	List<WebElement> date;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	WebElement todate;
	
	//methods
	
	public void leave() {
		leaveclk.click();
	}
	
	public void fromclk() {
		fromdate.click();
	}
	
	public void  monthclk(){
	monthclk.click();
	}
	
	public List<WebElement> monthelements(){
		return monthele;
	}
	
	public void yearclk(){
		 yearclk.click();
		
	}
	
	public List<WebElement> yearelements(){
		return yearele;
	}
	
	public List<WebElement> dateelement(){
		return date;
	}



}
