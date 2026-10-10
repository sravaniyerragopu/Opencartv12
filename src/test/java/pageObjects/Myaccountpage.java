package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basepage{
	
	public Myaccountpage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement myaccount;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement clicklogout;
	
	
	public boolean checkmyacc()
	
	{
		try {
		return myaccount.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void bntlogout()
	{
		clicklogout.click();
	}
	
	
	
}
