package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setup.BaseTest;
import webPages.FileUpload; 


public class Scenario_3 extends BaseTest {
	
	@Test
	public void fileUploadTest()
	{
		WebDriver driver = super.getDriver();
		String fileName = "Sample.txt";
		FileUpload.uploadFileFromWeb(driver, fileName);
	}

}
