package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepageloc;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;
import utilities.DataProviders;

public class Tc_003LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups= {"dataprovider"})
	public void verifylogin(String email, String password, String exp)
	{ 
		
			
		logger.info("started the exection of login");
		Homepageloc homobj=new Homepageloc(driver);
		homobj.myaccount();
		homobj.login();
		
		Loginpage logobj=new Loginpage(driver);
		logobj.enteremail(email);
		logobj.enterpassword(password);
		logobj.btnlogin();
		
		Myaccountpage accobj=new Myaccountpage(driver);
		boolean targetpage =accobj.checkmyacc();
		
		//Assert.assertTrue(targetpage);
		
		if(exp.equalsIgnoreCase("valid"))
		{
			if(targetpage==true)
			{
				accobj.bntlogout();
				Assert.assertTrue(true);
			}
			
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				accobj.bntlogout();
				Assert.assertTrue(false);
			}
			
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
	

	}
}
