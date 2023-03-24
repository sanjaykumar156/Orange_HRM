package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Oc_001login extends BaseClass {
	
	
	@Test (groups = {"sanity"}, priority =1)
	public void login() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();
		
		HomePage hp = new HomePage(driver);
		
		boolean status = hp.dashboard();
		Assert.assertEquals(true, status);
		
	}

}
