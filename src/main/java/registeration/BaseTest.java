package registeration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver ;
	
	@BeforeClass
	public void openbrowser() {
	String path = System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	//driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

}
