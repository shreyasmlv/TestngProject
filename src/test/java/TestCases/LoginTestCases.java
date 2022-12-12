package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.Baseclass;
import Resources.commonmethods;
import Resources.constant;

public class LoginTestCases extends Baseclass {

	@Test
	public void login() throws IOException {

		LoginPageObjects LPO = new LoginPageObjects(driver);
		LPO.Enterusername().sendKeys(constant.username);
		LPO.Enterpassword().sendKeys(constant.password);
		LPO.Clickonlogin().click();
		//LPO.Tryforfree().click();
		commonmethods.handleassertion(LPO.errormsg().getText(),constant.errormsg);

	}

}
