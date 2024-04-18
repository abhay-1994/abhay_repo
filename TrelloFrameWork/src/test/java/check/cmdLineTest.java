package check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cmdLineTest {

	
	@Test
	public void mavenTest() {
		WebDriver driver=null;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		driver.get(URL);
	}
}