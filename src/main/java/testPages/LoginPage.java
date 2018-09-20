package testPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;
import testUtils.TestUtils;

public class LoginPage extends Base {
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement objLoginButton;
	
	@FindBy(xpath="//iframe[1]")
	WebElement form;
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public String enterUsername(String strText)
	{
		username.sendKeys(strText);
		return username.getAttribute("value");	
	}
	
	public String enterPassword(String strText)
	{
		password.sendKeys(strText);
		return username.getAttribute("value");	
	}
	
	public boolean clickButton()
	{
		//driver.switchTo().frame(0);
		//TestUtils.performExplicitWait(4000, objLoginButton);
		//objLoginButton.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",objLoginButton);
		return true;
		
	}

}
