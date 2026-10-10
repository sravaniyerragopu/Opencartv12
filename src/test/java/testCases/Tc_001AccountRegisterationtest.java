package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Homepageloc;
import pageObjects.Regestrationpageloc;

public class Tc_001AccountRegisterationtest extends BaseClass{

	
	@Test(groups= {"regression","master"})
	public void verfy_account_registeration()
	{
		logger.info("starting the excution");
		Homepageloc hoobj=new Homepageloc(driver);
		
		logger.info("starting the homepage exceution");
		
		hoobj.myaccount();
		hoobj.register();
		
		
		Regestrationpageloc regobj=new Regestrationpageloc(driver);
		
		logger.info("starting the registration");
		
		regobj.firstname(randomstring());
        regobj.lastname(randomstring());
        regobj.email(randomstring()+"@gmail.com");
        regobj.password("yerrasra");
        regobj.confirmpassword("yerrasra");
        regobj.phonenum("8609040268");
        regobj.agree();
        regobj.presscontinue();
        
          
				
	}

	
}
