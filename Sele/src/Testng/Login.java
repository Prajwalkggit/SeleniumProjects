package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login 
{
    WebDriver driver;
    
    @Test
    public void test()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	
    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    	String title = driver.getTitle();
    	System.out.println(title);
    	
    	Assert.assertEquals(title, "OrangeHRM");
    	System.out.println(1);
    	
    	
    	
    }
}
