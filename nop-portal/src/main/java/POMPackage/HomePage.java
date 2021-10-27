package POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath="//span[@class='ico-user sprite-image']")
	private WebElement over;
	
	@FindBy(xpath="//a[@class='ico-account']")
	private WebElement click;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		driver=driver;
		
		Actions s = new Actions(driver);
		s.moveToElement(over).build().perform();
		
		
		
		
	}
	public void EcoHome() {
		click.click();
		
		//dropdown.click();
		

}
	
}	
