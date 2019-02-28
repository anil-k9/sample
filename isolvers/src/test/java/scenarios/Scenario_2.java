package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import setup.BaseTest;
import webPages.Dropdown;

public class Scenario_2 extends BaseTest {
	
	@Test
	public void dropdownTest()
	{
		WebDriver driver = super.getDriver();
		Dropdown.SelectAllValuesFromDropdown(driver);
	}

}
