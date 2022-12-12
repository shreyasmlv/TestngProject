package Resources;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	public WebDriver driver;
	
	public void BrowserInitialization() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SeleniumTestngProject\\src\\main\\java\\Resources\\data.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String Browsername=prop.getProperty("browser");
	if(Browsername.equalsIgnoreCase("chrome")) {
		
 driver=new ChromeDriver();

		
	}
	else if(Browsername.equalsIgnoreCase("firefox")) {
		
		//firefox code
	}
	else {
		System.out.println("enter valid browser name");
	}
	}
	@BeforeMethod
	public void launch() throws IOException {
		
		BrowserInitialization();
		 driver.get("https://login.salesforce.com/?locale=in");
		
	}
	}
	
	


