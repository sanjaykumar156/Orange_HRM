package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePage{

	public AdminPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy(linkText = "Admin")
	WebElement btnadmin;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	WebElement btnadd;
	
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement userroleclk;
	
	@FindBy(xpath ="//div[@role='listbox']//span")
	List<WebElement> dropdown;
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	WebElement selectemployee;
	
	@FindBy(xpath ="//div[@role='listbox']//span")
	List<WebElement> employee;
	
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
	WebElement selectstatus;
	
	@FindBy(xpath = "//div[@role='option']//span")
	List<WebElement> status; 
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement txtusername;
	
	@FindBy(xpath ="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement txtpassword;
	
	@FindBy(xpath ="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	WebElement txtconform;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveclk;
	
	//methods 
	
	public void admin() {
		btnadmin.click();
	}
	
	public void addbutton() {
		btnadd.click();
	}
	
	public void roleclick() {
		userroleclk.click();
	}
	
	public List<WebElement> dropdown() { //div[@role='listbox']//span
		return dropdown;
	}
	
	public void selectemp(String emp) {
		selectemployee.sendKeys(emp);
	}
	
	public List<WebElement> employeename(){
		return employee;
	}
	
	public void drpstatus() {
		selectstatus.click();
	}
	
	public List<WebElement> status(){
		return status;
	}
	
	public void username(String user) {
		txtusername.sendKeys(user);
	}
	
	public void password(String pswd) {
		txtpassword.sendKeys(pswd);
	}
	public void conformpswd(String cpswd) {
		txtconform.sendKeys(cpswd);
	}
	public void savebtn() {
		saveclk.click();
	
	}
}
