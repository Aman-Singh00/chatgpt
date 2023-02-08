package Automation.testscript;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Automation.genericlib.BaseClass;
@Listeners(Automation.genericlib.ListenerImplementation.class)

public class TypesOfWork extends BaseClass {
	
	@Test(groups = {"System"})
	public void type() throws EncryptedDocumentException, IOException {
		
		
	driver.findElement(By.xpath("//div[@class='menuTable']/div[2]/descendant::div[@class='menu_icon']")).click();
	driver.findElement(By.linkText("Types of Wor")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	String custName=du.getDataFromExcelSheet("sheet1", 0, 0);
	driver.findElement(By.id("name")).sendKeys(custName);
	driver.findElement(By.xpath("//td[@id='ButtonPane']/input[contains(@value,'Cancel')]")).click();
	System.out.println(cu.alert(driver));
	cu.ok(driver);
	
	
	}
}
