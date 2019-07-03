package registeration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintAllLinks extends BaseTest {

	
	@Test
	public void googleLinks() {
		Reporter.log("user is trying launch browser");
		driver.get("https://www.google.com");
		
		Reporter.log("user has opened google");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		System.out.println("No of links"+ link.size());
		//enhanced for loop or foreach loop
		for(WebElement ele:link) {
			System.out.println(ele.getText());
		}
		
		
		
		
		
	}

	
	
	 
}
