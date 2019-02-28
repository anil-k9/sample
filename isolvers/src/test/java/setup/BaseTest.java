package setup;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		String workingDir = System.getProperty("user.dir");
		String chromeDriverPath = workingDir+"\\src\\test\\resources\\drivers\\chromedriver.exe";
		String downloadFilepath = workingDir+"\\src\\test\\resources\\download";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", downloadFilepath);
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		driver.get("http://the-internet.herokuapp.com/");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		if (driver != null)
		{
			driver.quit();
		}
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	

}
