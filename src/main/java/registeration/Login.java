package registeration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
/**
 * 
 * @author Tejaswini
 *
 */
public class Login  extends BaseTest{
	@Test
	public void Tc002() {
		driver.get("http://18.224.140.205/supplierLogin");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prasanna@gamasome.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123!");
		driver.findElement(By.xpath(" //button[@type='submit']" )).click();
		driver.findElement(By.xpath("//*[contains(text(),'Forgot Password')]")).click();
		driver.findElement(By.xpath(" //input[@name='email']")).sendKeys("prasanna@gamasome.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}