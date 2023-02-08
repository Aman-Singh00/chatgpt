package Automation.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingLocator {
	
	public SettingLocator(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="firstHierarchyLevelCodeSelect")
	private WebElement dropdown;
	
	@FindBy(id="FormModifiedTextCell")
	private WebElement result;
	

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getResult() {
		return result;
	}
	
	public WebElement dropdown() {
		WebElement dropdown=getDropdown();
		return dropdown;
		
	}
	public String Result()
	{
		String result=getResult().getText();
		return result;
		
	}
	
	
	
	
}
