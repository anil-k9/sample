package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	
	public static void uploadFileFromWeb(WebDriver driver, String fileName)
	{

		//Get fluent wait
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		
		//Navigate to file upload screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.Home.fileUpload));
		driver.findElement(locators.Home.fileUpload).click();

		//Wait until user navigated to file upload screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.FileUpload.chooseFile));
		
		//Upload file
		driver.findElement(locators.FileUpload.chooseFile).click();
		WindowsActions.uploadFile("\\src\\test\\resources\\files\\"+fileName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(locators.FileUpload.upload).click();
		
		//Wait for upload to be complete
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.FileUpload.uploadedFiles));
		
		//Verify uploaded file
		String file = driver.findElement(locators.FileUpload.uploadedFiles).getText();
		System.out.println("***File upload status is: ");
		if(driver.findElement(locators.FileUpload.uploadedFiles).getText().equals("Sample.txt"))
		{
			System.out.println("File uploaded correctly");
		}
		else
		{
			System.out.println("File not uploaded correctly");
		}
	}

}
