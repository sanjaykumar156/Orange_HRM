package testcases;

import static org.testng.Assert.fail;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AdminPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Oc_003AdminClass extends BaseClass {

	@Test(groups = {"functional"})
	public void adminprofile() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(4000);

		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();

		HomePage hp = new HomePage(driver);

		boolean status = hp.dashboard();
		Assert.assertEquals(true, status);
		AdminPage ap = new AdminPage(driver);
		ap.admin();
		ap.addbutton();
		ap.roleclick();
		List<WebElement> options = ap.dropdown();
		for (int i = 1; i <= options.size(); i++) {
			if (options.get(i).getText().equals("ESS")) {
				System.out.println(options.get(i).getText());
				options.get(i).click();
			}

		}

		ap.selectemp("o");
		Thread.sleep(5000);
		List<WebElement> names = ap.employeename();
		
		for(int i=0;i<names.size();i++) {
			if(names.get(i).getText().equals("Odis Adalwin")) {
				names.get(i).click();
			}
		}
		
		ap.drpstatus();
		List<WebElement> sts = ap.status();
		sts.size();
		for(int i=0; i<sts.size(); i++) {
			if(sts.get(i).getText().equals("Enabled")){
				sts.get(i).click();
			}
		}
		
		ap.username("sanjaykumar");
		Thread.sleep(7000);
		ap.password(rb.getString("password1"));
		ap.conformpswd(rb.getString("password1"));
		Thread.sleep(1000);
		ap.savebtn();
		String expected =  "System Users";
		String actual = ap.text("System Users");
		if(expected.equals(actual)) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
		
		
		
		
	}

}
