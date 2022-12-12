package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By Tryforfree=By.xpath("//a[@id='signup_link']");
	private By errormsg=By.xpath("//div[@id='error']");

  
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement Enterusername() {
    	 return driver.findElement(username);
     }
     public WebElement Enterpassword() {
    	 return driver.findElement(password);
     }
     public WebElement Clickonlogin() {
    	 return driver.findElement(login);
     }
     public WebElement Tryforfree() {
    	 return driver.findElement(Tryforfree);
     }
     public WebElement errormsg() {
    	 return driver.findElement(errormsg);
     }
}
	


