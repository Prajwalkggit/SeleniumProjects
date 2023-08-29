package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GeneraJmeter 
{
	WebDriver driver = null;
	
	@BeforeMethod
    public void openAppln()
    {
   	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver1.exe");
	     driver = new ChromeDriver();
	     driver.get("https://example.testproject.io/");
    }
    
    @AfterMethod
    public void closeAppln() throws InterruptedException
    {
   	 Thread.sleep(3000);
   	 driver.quit();
    }
    
    @Test
    public void test1()
    {
   	      System.out.println("first test case executed.....");
    }  
    
    @Test
    public void test2()
    {
   	      System.out.println("second test case executed.....");
    }  
   
}


