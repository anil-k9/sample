package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setup.BaseTest;
import webPages.JQueryElements;

public class Scenario_5 extends BaseTest {
	
	@Test
	public void jQueryTestOptions()
	{
		WebDriver driver = super.getDriver();
		JQueryElements.listAllElements(driver);
	}
	
	@Test
	public void jQueryTestFileDownload()
	{
		WebDriver driver = super.getDriver();
		JQueryElements.downloadAllFiles(driver);
	}

}
