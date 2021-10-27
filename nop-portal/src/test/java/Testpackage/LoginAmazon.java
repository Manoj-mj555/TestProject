package Testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POMPackage.AmazonLogin;
import basetest.Base;

public class LoginAmazon extends Base {
	
	private WebDriver driver;
	private AmazonLogin log;
	
	@BeforeTest
	@Parameters("browser")
	
	public void Test(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=openChromeBrowser();
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=openFirefoxBrowser();
		}
	}
	@BeforeClass
	
	public void login() {
		log=new AmazonLogin(driver);
		log.LoginAmazon();
	}
	@BeforeMethod
	public void set() {
		driver.get("https://www.amazon.in/");
	}
	
	@org.testng.annotations.Test
	public void check() {
		String url=driver.getCurrentUrl();
		
	}
	
	@AfterClass
	
	public void close() {
		driver.close();
	}
	
	

}
