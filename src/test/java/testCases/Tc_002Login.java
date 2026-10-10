package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepageloc;
import pageObjects.Loginpage;
import pageObjects.Myaccountpage;

public class Tc_002Login extends BaseClass{
	
	@Test(groups= {"sanity","master"})
	public void verifylogin()
	{ 
		try {
			
			logger.info("started the exection of login");
		Homepageloc homobj=new Homepageloc(driver);
		homobj.myaccount();
		homobj.login();
		
		Loginpage logobj=new Loginpage(driver);
		logobj.enteremail(p.getProperty("email"));
		logobj.enterpassword(p.getProperty("password"));
		logobj.btnlogin();
		
		Myaccountpage accobj=new Myaccountpage(driver);
		boolean targetpage =accobj.checkmyacc();
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("finished the execution");
	}

}
