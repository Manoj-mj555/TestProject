package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement HelloSign;
	
	@FindBy (xpath="//input[@id='ap_email']")
	private WebElement Username;
	
	@FindBy (xpath="//input[@id='continue']")
	private WebElement Continue;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy (xpath="//input[@id='signInSubmit']")
	private WebElement SignIN;
	
	
	
	
	

	 public  AmazonLogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void LoginAmazon() {
		HelloSign.click();
		Username.sendKeys("9975557902");
		Continue.click();
		Password.sendKeys("Password@1");
		SignIN.click();
	}
	
	

}


