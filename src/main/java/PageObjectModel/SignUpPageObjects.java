package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver;
	
	private By enterfirstname=By.xpath("//input[@name='UserFirstName']");
	private By enterlastname=By.xpath("//input[@name='UserLastName']");
	private By enterworkemail=By.xpath("//input[@name='UserEmail']");
	private By entercompany=By.xpath("//input[@name='CompanyName']");
	private By enterphone=By.xpath("//input[@name='UserPhone']");
	private By selectjobtitle=By.xpath("//select[@name='UserTitle']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By selectcountry=By.xpath("//select[@name='CompanyCountry']");
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	
	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
	public WebElement enterfirstname() {
		return driver.findElement(enterfirstname);
	}
	public WebElement enterlastname() {
		return driver.findElement(enterlastname);
	}
	public WebElement enterworkemail() {
		return driver.findElement(enterworkemail);
	}
	public WebElement entercompany() {
		return driver.findElement(entercompany);
	}
	public WebElement enterphone() {
		return driver.findElement(enterphone);
	}
	public WebElement selectjobtitle() {
		return driver.findElement(selectjobtitle);
	}
	public WebElement employees() {
		return driver.findElement(employees);
	}
	public WebElement selectcountry() {
		return driver.findElement(selectcountry);
	}
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	
	}
	

