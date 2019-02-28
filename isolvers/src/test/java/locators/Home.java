package locators;

import org.openqa.selenium.By;

public class Home {
	
	public static By basicAuth = By.xpath("//a[@href='/basic_auth']");
	public static By dropdown = By.xpath("//a[@href='/dropdown']");
	public static By fileUpload = By.xpath("//a[@href='/upload']");
	public static By fileDownload = By.xpath("//a[@href='/download']");
	public static By jqueryMenu = By.xpath("//a[@href='/jqueryui/menu']");

}
