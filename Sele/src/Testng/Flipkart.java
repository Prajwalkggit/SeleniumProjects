package Testng;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Flipkart
{
    WebDriver driver;
	
    @Test
    public void test1() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedrivernew.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	
    	driver.manage().window().maximize();
    	driver.get("https://example.testproject.io/web/");
    	Thread.sleep(2000);
    	driver.findElement(By.id("name")).sendKeys("Test");
    	driver.findElement(By.id("password")).sendKeys("12345");
    	driver.findElement(By.id("login")).click();
    	
    	Thread.sleep(2000);
    	WebElement ele = driver.findElement(By.id("country"));
    	Select s = new Select (ele);
    	s.selectByVisibleText("India");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("address")).sendKeys("Testing address");
    	driver.findElement(By.id("email")).sendKeys("prajwal@gmail.com");
    	driver.findElement(By.id("phone")).sendKeys("797545");
    	driver.findElement(By.id("save")).click();
    	
    	Thread.sleep(3000);
    	driver.findElement(By.id("logout")).click();
    	
    	driver.close();
    	
    }
}
