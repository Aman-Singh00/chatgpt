package Automation.genericlib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Parameterization {
	@Test(dataProvider = "datasupplier")
	public void login(String productname) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys(productname,Keys.ENTER);
		String result=driver.findElement(By.xpath("//span[contains(@class,'Ermr')]")).getText();
		System.out.println(result);
	}


@DataProvider
public Object[][]  datasupplier()
{
	Object[][]objarr = new Object[5][1];
	objarr[0][0]="Iphone";
	objarr[1][0]="Clock";
	objarr[2][0]="Watches";
	objarr[3][0]="Flowers";
	objarr[4][0]="Laptop";
	return objarr;
	

}
}