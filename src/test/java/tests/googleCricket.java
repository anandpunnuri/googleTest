package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.Base;

public class googleCricket extends Base{

	private WebDriver driver;
	
	@Test
	public void googleCricket()
	{
		try
		{
			driver = Base.getDriver();
			driver.get("https://www.google.com");
			driver.findElement(By.xpath("//*[contains(@name,'q')]")).sendKeys("Cricket");
			driver.findElement(By.xpath("//*[contains(@name,'q')]")).sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			Assert.assertTrue(driver.getTitle().contains("Cricket"), "The page title is not Cricket");
		}
		catch(Exception e)
		{
			Reporter.log("Exception: "+e, true);
		}
	}
	
}
