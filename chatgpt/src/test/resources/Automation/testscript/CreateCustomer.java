package Automation.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Automation.genericlib.BaseClass;
import Automation.genericlib.CommanUtility;
import Automation.genericlib.DataUtlity;

public class CreateCustomer extends BaseClass {
	@Test(groups = {"Smoke"})
	public void customerCreation() throws EncryptedDocumentException, IOException
	{
		
		int num=cu.getRandomNum(10000);
		String custName=du.getDataFromExcelSheet("sheet1", 0, 0);
		custName=custName+num;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.className("addNewButton")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(custName);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		cu.elementWait("//div[@class='titleEditButtonContainer']/div[1]", custName, driver);
		String expcustomername = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")).getText();
		System.out.println(expcustomername);
		SoftAssert sc = new SoftAssert();
		sc.assertEquals(custName,expcustomername);
		System.out.println("test is pass");
		sc.assertAll();
		System.out.println("test pass");
		
		
	}

}
