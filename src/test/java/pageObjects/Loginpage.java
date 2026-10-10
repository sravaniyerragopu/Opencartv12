package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	
	public Loginpage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement txtemail;
	@FindBy(xpath="//input[@id='input-password']") WebElement txtpassword;
	@FindBy(xpath="//input[@value='Login']") WebElement clickklogin;
	
	public void enteremail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void enterpassword(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	
	public void btnlogin()
	{
		clickklogin.click();
	}

}
