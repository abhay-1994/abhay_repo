package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadTheDataFromXmlFile {
	WebDriver driver;
	@Test
	@Parameters({"browser", "url"})
	
	public void loginToVtiger(String browser, String url) {
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		
	}

	@Test
	@Parameters({"browser", "url"})
	public void test() {
		System.out.println("Test");
	}

}
