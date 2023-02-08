package Automation.testscript;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation.elementRepository.HomeLocator;
import Automation.elementRepository.SettingLocator;
import Automation.genericlib.BaseClass;
import Automation.genericlib.CommanUtility;
import Automation.genericlib.DataUtlity;

public class DropDown extends BaseClass {
	
@Test(groups = {"System","Smoke"})
	public void dropdownHandling() throws IOException, InterruptedException {
		
//		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/descendant::div[@class='menu_icon']")).click();
//		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
//		WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
//		cu.getSelectByVisibleText(dropdown, 4);
//		String text = driver.findElement(By.id("FormModifiedTextCell")).getText();
//		System.out.println(text);
	
	HomeLocator hm = new HomeLocator(driver);
	hm.setting();
	SettingLocator su = new SettingLocator(driver);
	WebElement dropdown = su.dropdown();
	cu.getSelectByVisibleText(dropdown, 3);
	System.out.println(su.Result());
	
		
	}

}
