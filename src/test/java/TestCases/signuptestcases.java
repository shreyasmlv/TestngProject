package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.Baseclass;
import Resources.commonmethods;
import Resources.constant;

public class signuptestcases extends Baseclass {
	@Test
	public void signup() throws IOException, InterruptedException {
		BrowserInitialization();
		 driver.get("https://login.salesforce.com/?locale=in");	
		
		 LoginPageObjects LPO=new LoginPageObjects(driver);
		 LPO.Tryforfree().click();
		 Thread.sleep(5000);
		 
		 SignUpPageObjects SPO=new SignUpPageObjects(driver);
		 SPO.enterfirstname().sendKeys(constant.firstname);
		 Thread.sleep(3000);
		 SPO.enterlastname().sendKeys(constant.lastname);
		 Thread.sleep(3000);

		 SPO.enterworkemail().sendKeys(constant.workemail);
		 Thread.sleep(3000);

		 SPO.entercompany().sendKeys(constant.company);
		 Thread.sleep(3000);

		 SPO.enterphone().sendKeys(constant.phone);
		 Thread.sleep(3000);

		commonmethods.selectdropdowns(SPO.selectjobtitle(), 2);
		Thread.sleep(3000);

		commonmethods.selectdropdowns(SPO.employees(), 1);
		Thread.sleep(3000);

		 commonmethods.selectdropdowns(SPO.selectcountry(), 6);
		 Thread.sleep(3000);

		 SPO.checkbox().click();
		
	}

}
