package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AdminPage;
import pageobjects.CheckboxPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Oc_004Checkbox extends BaseClass {
	
	
	
	@Test
	public void checkbox() {
        LoginPage lp = new LoginPage(driver);
		
		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();
		
		HomePage hp = new HomePage(driver);
		
		boolean status = hp.dashboard();
		Assert.assertEquals(true, status);
		
		AdminPage ap = new AdminPage(driver);
		ap.admin();
		
		CheckboxPage cp = new CheckboxPage(driver);
		List<WebElement> boxes = cp.check();
		
		for(int i =2; i<boxes.size(); i++) {
			boxes.get(i).click();
			
			
		}
		
		cp.deleteclick();
	}

}
