package registeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {
	
	@Test
	public void tc001() throws InterruptedException {
		
	driver.get("http://18.224.140.205/supplier/register");
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Teju");
	driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Sharma");
	driver.findElement(By.xpath("//input[@name='bank']")).sendKeys("XYZ");
	driver.findElement(By.xpath("//select[@name='home_phone_country_code']")).sendKeys("+91");
	driver.findElement(By.xpath("//input[@name='home_phone']")).sendKeys("9686705497");
	driver.findElement(By.xpath("//select[@name='work_phone_country_code']")).sendKeys("+91");
	driver.findElement(By.xpath("//input[@name='work_phone']")).sendKeys("6361607773");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tejaswinisharma1991@gmail.com");
	driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("123445");
	driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Scr Recidency marathalli");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");
	driver.findElement(By.xpath(" //input[@name='state']")).sendKeys("Karnataka");
	driver.findElement(By.xpath(" //select[@name='country']")).sendKeys("India");
	driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("560037");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@name='termsAndCondition']")).click();
	
}
}