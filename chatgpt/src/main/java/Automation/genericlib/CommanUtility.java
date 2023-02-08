package Automation.genericlib;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommanUtility {
	
	
	public int getRandomNum(int range)
	{
		Random r = new Random();
		int num=r.nextInt(range);
		return num;
	}
	public void getSelectByVisibleText(WebElement dropdown,int indexno)
	{
		Select s  = new Select(dropdown);
		s.selectByIndex(indexno);
	}
	
	public String title(String title,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(title));
		return title;
	}
	public void elementWait(String sc,String custName,WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(sc), custName));
	}
	public String alert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		String msg1=alt.getText();
		return msg1;
	}
	public void ok(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
}
