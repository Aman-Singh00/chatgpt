package Automation.testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.Reporter;


import Automation.genericlib.BaseClass;

public class FetchTitle extends BaseClass {
	
	@Test(groups = {"Integration"})
	public void title()
	{	
		
		String sd = cu.title("Enter Time-Track", driver);
		System.out.println(driver.getTitle());
		Reporter.log("fetch title successfully");
		Reporter.log("tc is pass",true);
		String title="actiTIME -  Enter Time-Track";
		SoftAssert sc = new SoftAssert();
		sc.assertTrue(title.contains(sd));
		System.out.println("tc pass");
		sc.assertAll();
		System.out.println("tc pass");
		
	}

}
