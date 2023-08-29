package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon 
{
WebDriver driver;
    
    @Test
    public void test()
    {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	//driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
    	driver.findElement(By.xpath("//input [@type='submit']")).click();
    	//driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base']) [15]")).click();
    	//driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']) [1]")).click();
    	driver.get("https://www.amazon.in/Apple-iPhone-128GB-Space-Black/dp/B0BDJ7P6NG/ref=sr_1_1_sspa?crid=2DMVIB0WJ17JX&keywords=iphone+14&qid=1692261553&sprefix=iphone+14%2Caps%2C244&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
    	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    	driver.close();
    }
}
