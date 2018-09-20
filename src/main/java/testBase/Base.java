package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	
	
	public Base()
	{
		FileInputStream fis;
		prop=new Properties();
		try
		{
			fis=new FileInputStream("src\\main\\java\\testConfig\\config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			System.out.println("###########Issue with Property file###########");
			e.printStackTrace();
		}
		
	}
	
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Automation\\2.Project Selenium\\3. Webdrivers\\Chrome Driver 2.36\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	

	

}
