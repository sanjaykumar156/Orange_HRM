package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.ContactPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Oc_006Myinfo extends BaseClass {
	
	@Test
	public void myinfopage() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(4000);

		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();

		HomePage hp = new HomePage(driver);

		boolean status = hp.dashboard();
		Assert.assertEquals(true, status);
		
		ContactPage cp = new ContactPage(driver);
		cp.myinfo();
		cp.contactdetails();
		cp.street1(rb.getString("street1"));
		cp.street2(rb.getString("street2"));
		cp.city(rb.getString("city"));
		cp.state(rb.getString("state"));
		cp.postal(rb.getString("postal"));
		cp.select();
		List<WebElement> country = cp.country();
		for(int i =0;i<country.size(); i++) {
			if(country.get(i).getText().equals("India")) {
				country.get(i).click();
			}
		}
		cp.mobile(rb.getString("mobile"));
		cp.email(rb.getString("email"));
		cp.savebtn();
	}
	

}
