package registeration;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * 
 * @author Tejaswini
 *
 */
public class Login  extends BaseTest{
	@Test
	public void Tc002() {
		
		Reporter.log("supplier is on login page.");
		driver.get("http://18.224.140.205/supplierLogin");
		Reporter.log("supplier is on login page."+driver.getCurrentUrl());

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prasanna@gamasome.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123!");
		driver.findElement(By.xpath(" //button[@type='submit']" )).click();
		driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();
		driver.findElement(By.xpath(" //input[@name='email']")).sendKeys("prasanna@gamasome.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}