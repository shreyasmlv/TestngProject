package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonmethods {

	public static void handleassertion(String actualString,String expectedString) {
		SoftAssert assertion=new SoftAssert();
		String actual=actualString;
		String expected=expectedString;
		assertion.assertEquals(actual, expected);
		assertion.assertAll();
		
	}
	
	public static void selectdropdowns(WebElement dropdown,int index) {
		Select s=new Select(dropdown);
		s.selectByIndex(index);
		
	}
}
