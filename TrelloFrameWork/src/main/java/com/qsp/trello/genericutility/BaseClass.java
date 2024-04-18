package com.qsp.trello.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class BaseClass {
	public WebDriver driver;
	public static WebDriverUtility webDriverUtils= new WebDriverUtility();
	
	FileUtility fileUtils= new FileUtility();
	
	@BeforeMethod
	public void preCondition() throws IOException {
		String browserName = fileUtils.readTheDataFromPropertyFile("browser");
		if (browserName.equals("chrome")) {
			driver= new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		webDriverUtils.implicitWait(driver);
		driver.get(fileUtils.readTheDataFromPropertyFile("url"));
		
		
	}
	//@AfterMethod
	public void postCondition() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
