package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class Base {

	private static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
