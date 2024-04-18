package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Implementation {
	WebDriver driver;
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
    public void postCndition() {
    	driver.manage().window().minimize();
    	driver.quit();
	
    }
		
}


