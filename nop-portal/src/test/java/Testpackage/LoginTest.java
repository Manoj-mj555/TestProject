package Testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import POMPackage.HomePage;
import POMPackage.Login;
import basetest.BaseFunction;

public class LoginTest extends BaseFunction {
	
	private WebDriver driver;

	
	private Login login;
	private HomePage home;
		
	@BeforeTest
	@Parameters("browser")
	
	public void beforeTest(String browser) throws InterruptedException {
		
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
	
	public void loginapp() {
		login=new Login(driver);
		login.Noplogin();
		
		home=new HomePage(driver);
		home.EcoHome();
		
		
		
	}
	@BeforeMethod
	
	public void  setup() {
		driver.get("https://www.nopcommerce.com/en");
	}
	
	@Test
	public void verifylogin() {
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test
	public void home() {
		
	}
	
	@AfterClass
	
	public void logout() {
		System.out.println("done");
	}
	
	

}
