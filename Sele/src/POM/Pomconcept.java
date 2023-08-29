package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pomconcept 
{
WebDriver driver;
    
    @Test
    public void test() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedrivernew.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	//driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    	Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
        ele.click();
        Thread.sleep(4000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        ele.click();
    }
}
