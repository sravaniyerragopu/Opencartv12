package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepageloc extends Basepage{
	
	public Homepageloc (WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement climyaccount;
	@FindBy(xpath="//a[text()='Register']") WebElement clickregister;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement clicklogin;
	
	//driver.findElement(By.xpath("//a[normalize-space()='Login']"))
	
	
	public void myaccount()
	{
		climyaccount.click();
	}
	 
	public void register()
	{
		clickregister.click();
	}
	
	public void login()
	{
		clicklogin.click();
	}

}
