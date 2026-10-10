package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Regestrationpageloc extends Basepage{
	
	public Regestrationpageloc(WebDriver driver)
	{
		super(driver);
	}
	
	


@FindBy(xpath="//input[@id='input-firstname']") WebElement sendname;
@FindBy(xpath="//input[@id='input-lastname']")  WebElement sendlastname;
@FindBy(xpath="//input[@id='input-email']") WebElement sendemail;
@FindBy(xpath="//input[@id='input-password']") WebElement sendpassword;
@FindBy(xpath="//input[@name='agree']") WebElement enableagree;

@FindBy(xpath="//input[@id='input-telephone']") WebElement sendphone;
//input[@id='input-confirm']
@FindBy(xpath="//input[@id='input-confirm']") WebElement sendconfirmpassword;
@FindBy(xpath="//*[@value='Continue']") WebElement clickcontinue;



public void firstname(String entername)
{
	sendname.sendKeys(entername);
	}
public void lastname(String enterlastname)
{
	sendlastname.sendKeys(enterlastname);
	}

public void email(String enteremail)
{
	sendemail.sendKeys(enteremail);
	}

public void password(String enterpassword)
{
	sendpassword.sendKeys(enterpassword);
	}

public void agree()
{
	enableagree.click();
	}
public void phonenum(String enterphoneno)
{
	sendphone.sendKeys(enterphoneno);
	}
public void confirmpassword(String enterconfirmpass)
{
	sendconfirmpassword.sendKeys(enterconfirmpass);
	}

public void presscontinue()
{
	clickcontinue.click();
	}

}
