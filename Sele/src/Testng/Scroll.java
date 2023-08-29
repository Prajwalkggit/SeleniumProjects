package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll 
{
WebDriver driver;
    
    @Test
    public void test() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 12");
    	driver.findElement(By.xpath("//input [@type='submit']")).click();
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
        js.executeScript("window.scrollBy(0,500)");//scroll down sing positive value
        
        Thread.sleep(3000);
        
        js.executeScript("window.scrollBy(0,-500)");//scroll up using negative value
        
        
        
        
        
        
        
        
        
        
    	
    	
    	
    	
    }
}
