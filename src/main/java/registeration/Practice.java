package registeration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice extends BaseTest {

	
	@Test
	public void testAmazon() {
		Reporter.log("user is trying launch browser");
		driver.get("https://www.amazon.com");
		
		Reporter.log("user has opened amazon");
	}

	
	
	 
}
