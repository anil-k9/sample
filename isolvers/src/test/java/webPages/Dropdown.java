package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Home;

public class Dropdown {
	
	public static void SelectAllValuesFromDropdown(WebDriver driver)
	{
		//Get fluent wait
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		
		//Navigate to dropdown page
		driver.findElement(Home.dropdown).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(locators.DropDown.dropdown));
		
		//Select each option and print it in console
		Select select = new Select(driver.findElement(locators.DropDown.dropdown));
		System.out.println("***Dropdown options are: ");
		for (WebElement element : select.getOptions())
		{
			element.click();
			System.out.println(element.getText());
		}
	}

}
