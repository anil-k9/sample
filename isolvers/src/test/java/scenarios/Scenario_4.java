package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setup.BaseTest;
import webPages.DownloadFile;

public class Scenario_4 extends BaseTest {
	
	@Test
	public void fileDownLoadTest()
	{
		WebDriver driver = super.getDriver();
		String fileName = "Sample.txt";
		DownloadFile.downloadFile(driver, fileName);
	}

}
