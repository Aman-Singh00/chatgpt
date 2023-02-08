package Automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLocator {
	
	public HomeLocator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='menuTable']/div[2]/descendant::div[@class='menu_icon']")
	private WebElement setting;
	@FindBy(xpath="//div[text()='Manage system settings & configure actiTIME']")
	private WebElement GeneralSetting;

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getGeneralSetting() {
		return GeneralSetting;
	}
	
	public void setting()
	{
		getSetting().click();
		getGeneralSetting().click();
		
	}

}
