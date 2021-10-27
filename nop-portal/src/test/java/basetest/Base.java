package basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
public static WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\majog\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\majog\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		
		
		return driver;
	}


}
