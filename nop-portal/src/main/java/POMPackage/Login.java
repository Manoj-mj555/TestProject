package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(xpath="//span[@class='ico-user sprite-image']")
	private WebElement action;

	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement login;

	@FindBy(id="Username")
	private WebElement username;

	@FindBy(xpath="//input[@id='Password']")
	private WebElement pass;

	@FindBy(xpath="//label[@class='custom-control-label']")
	private WebElement Rem;

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login1;



	public Login(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	 driver=driver;
	 
	 Actions s = new Actions(driver);
	 s.moveToElement(action).build().perform();
	 
	}

	public void Noplogin() {
		login.click();
		username.sendKeys("rowdy@123");
		pass.sendKeys("dnyaneshwar1995");
		Rem.click();
		boolean b= Rem.isSelected();
		
		System.out.println(b);
		login1.click();
		
	}
		
	}



