package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Generic 
{
     public WebDriver driver;
     
     @BeforeMethod
     public void openAppln()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver-win64\\chromedriver.exe");
 	     driver = new ChromeDriver();
 	     driver.get("https://www.saucedemo.com/");
     }
     
     @AfterMethod
     public void closeAppln() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 driver.quit();
     }
     
     
}
