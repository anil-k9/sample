package webPages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryElements {
		
	public static void listAllElements(WebDriver driver)
	{
		navigate(driver);
		listSubElements(driver, driver.findElement(locators.JQuery.menu));		
	}
	
	public static void downloadAllFiles(WebDriver driver)
	{
		navigate(driver);
		List<WebElement> fileOptions = driver.findElements(By.xpath("//a[contains(@href,'download')]"));
		
		for(WebElement fileOption : fileOptions)
		{
			  String optionScript = "arguments[0].click();"; ((JavascriptExecutor)
			  driver).executeScript(optionScript, fileOption);
			 
			/*
			 * Actions actions = new Actions(driver);
			 * actions.click(fileOption).build().perform();
			 */
		}		
	}
	
	private static void navigate(WebDriver driver)
	{
		//Get fluent wait
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		
		//Navigate to file upload screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.Home.jqueryMenu));
		driver.findElement(locators.Home.jqueryMenu).click();

		//Wait until user navigated to file upload screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.JQuery.menu));
	}
	
	private static void listSubElements(WebDriver driver, WebElement element)
	{
		List<WebElement> subMenus = element.findElements(By.xpath("child::*"));
		for (WebElement subMenu : subMenus)
		{
			if(subMenu.getTagName().equals("ul"))
			{
				//Recursive call
				listSubElements(driver, subMenu);
			}
			else if(subMenu.getTagName().equals("li"))
			{
				listSubElements(driver, subMenu);
			}
			else
			{
				String optionScript = "return jQuery(arguments[0]).text();";
				String optionText = (String) ((JavascriptExecutor) driver).executeScript(optionScript, subMenu);
				System.out.println("Option: "+optionText);
			}
		}
	}

}
