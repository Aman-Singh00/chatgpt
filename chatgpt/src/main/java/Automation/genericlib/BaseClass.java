package Automation.genericlib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Automation.elementRepository.LoginLocator;


public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver listenerdriver;
	public DataUtlity du = new DataUtlity();
	public CommanUtility cu=new CommanUtility();
	@BeforeClass
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		listenerdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//@Parameters({"username","password"})
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("url"));
		LoginLocator ll = new LoginLocator(driver);
		ll.loginApp(du.getDataFromProperties("username"), du.getDataFromProperties("password"));
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	@AfterClass(alwaysRun = true)
	public void close()
	{
		driver.close();
	}

}
