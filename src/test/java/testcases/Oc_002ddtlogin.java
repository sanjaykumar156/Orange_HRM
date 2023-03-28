package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Oc_002ddtlogin extends BaseClass {
	
	@Test(dataProvider = "orange", groups = {"regression"}, priority =2)
	public void loginddt(String user ,String pswd,String exp) {
		LoginPage lp = new LoginPage(driver);
		try {
		
		lp.username(user);
		lp.password(pswd);
		lp.button();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(5000);
		boolean status = hp.dashboard();
		

		if (exp.equals("valid")) {
			if (status == true) {
				hp.buttonclick();
				hp.logout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		
		if (exp.equals("invalid")) {
			if (status == true) {
				
				hp.buttonclick();
				hp.logout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		
		}
		catch(Exception e) {
			Assert.fail(); 
		}
	}
		
	
	
	@DataProvider(name = "orange")
	String [][] logindata(){
		String data [][] = {{"Admin","admin123","valid"},
				{"admin","adnmi","invalid"},
				{"asduo","admin","invalid"}};
		return data;
		
	}
	
	
	

}
