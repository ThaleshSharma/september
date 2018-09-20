package testCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import junit.framework.Assert;
import testBase.Base;
import testPages.LoginPage;

public class LoginTest extends Base {
	
	LoginTest objTest;
	LoginPage objPage;
	
	public LoginTest()
	{
		super();
		
	}
	
	@BeforeTest
	public void initialize()
	{
		initialization();
		objPage=new LoginPage();
	}
	
	@Test
	public void performLoginTest()
	{
		String val1="thalesh";
		String val2=objPage.enterUsername(val1);
		Assert.assertEquals(val1, val2);
		
		String val3="thalesh";
		String val4=objPage.enterPassword(val1);
		Assert.assertEquals(val3, val4);
		
		boolean val5=objPage.clickButton();
		Assert.assertTrue(val5);
	}

	@AfterTest
	public void tearDown()
	{
		
		//driver.close();
	}
}
