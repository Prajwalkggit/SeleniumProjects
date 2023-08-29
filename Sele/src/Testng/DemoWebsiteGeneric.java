package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoWebsiteGeneric 
{
	
public WebDriver driver;
	
	@BeforeMethod
	public void openAppln() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("-------Browser has been launched---------");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//open the url
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		System.out.println("---------Browser has been closed successfully----------");
	}
	

}
