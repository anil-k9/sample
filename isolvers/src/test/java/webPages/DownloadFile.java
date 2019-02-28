package webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadFile {
	
	public static void downloadFile(WebDriver driver, String fileName)
	{

		//Get fluent wait
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		
		//Navigate to file upload screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.Home.fileDownload));
		driver.findElement(locators.Home.fileDownload).click();

		//Wait until user navigated to file upload screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.FileDownload.filesSections));
		
		//Download file
		List<WebElement> files = driver.findElements(locators.FileDownload.uploadedFiles);
		for (WebElement file : files)
		{
			if (file.getAttribute("href").contains(fileName))
			{
				file.click();
				String workingDir = System.getProperty("user.dir");
				String filePath = workingDir+"\\src\\test\\resources\\download\\"+fileName;
				FileReaderManager.readFile(filePath);
				break;
			}
		}
		
	}

}
