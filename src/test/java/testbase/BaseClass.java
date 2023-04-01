package testbase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	public static WebDriver driver;
	public ResourceBundle rb;
	
	@BeforeClass(groups= {"sanity","regression" , "functional"})
	@Parameters({"browser"})
	public void setup (String br) {
		rb= ResourceBundle.getBundle("config");
		
		if(rb.getString("browser").equals("edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(rb.getString("Appurl"));
		

}
	
	@AfterClass
	public void teardown() {
//		driver.quit();
	}
	
}