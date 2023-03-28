package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LeavePage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Oc_005leave extends BaseClass{
	
	@Test
	public void leaveclass() throws InterruptedException {
		
        LoginPage lp = new LoginPage(driver);
		
		lp.username(rb.getString("username"));
		lp.password(rb.getString("password"));
		lp.button();
		
		HomePage hp = new HomePage(driver);
		
		boolean status = hp.dashboard();
		Assert.assertEquals(true, status);
		LeavePage lpp = new LeavePage(driver);
		
		lpp.leave();
		
		
//		boolean enabled = lpp.fromclk();
//		Assert.assertEquals(true,enabled);
		lpp.fromclk();
		lpp.monthclk();
		
			
		
		Thread.sleep(5000);
		List<WebElement> month = lpp.monthelements();
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElements(month));
		
		for(int i = 0; i<month.size(); i++) {
			if(month.get(i).getText().equals("May")) {
				month.get(i).click();
			}
		}
		lpp.yearclk();
		
		List<WebElement> year = lpp.yearelements();
		WebDriverWait wait1  = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait1.until(ExpectedConditions.visibilityOfAllElements(year));
		for(int j=0; j<year.size(); j++) {
			if(year.get(j).getText().equals("2000")) {
				year.get(j).click();
			}
		}
		
		
		List<WebElement> date = lpp.dateelement();
		WebDriverWait wait2  = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.visibilityOfAllElements(date));
		
		for(int k=0; k<date.size(); k++) {
			if(date.get(k).getText().equals("4")) {
				date.get(k).click();
			}
		}
		
	}

}
