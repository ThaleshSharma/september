package testUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.Base;

public class TestUtils extends Base {
	
	public static void performExplicitWait(int waitTime, WebElement elm)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(elm));
	}

}
