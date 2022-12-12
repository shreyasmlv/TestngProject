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
		 SPO.enterlastname().sendKeys(constant.lastname);
		 SPO.enterworkemail().sendKeys(constant.workemail);
		 SPO.entercompany().sendKeys(constant.company);
		 SPO.enterphone().sendKeys(constant.phone);
		commonmethods.selectdropdowns(SPO.selectjobtitle(), 2);
		commonmethods.selectdropdowns(SPO.employees(), 1);
		 commonmethods.selectdropdowns(SPO.selectcountry(), 6);
		 SPO.checkbox().click();
		
	}

}
