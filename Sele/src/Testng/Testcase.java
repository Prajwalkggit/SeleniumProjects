package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase extends Generic
{
    @Test
    public void testlogin() throws InterruptedException
    {
    	driver.manage().window().maximize();
    	driver.findElement(By.id("name")).sendKeys("Prajwal");
    	Thread.sleep(2000);
    	driver.findElement(By.id("password")).sendKeys("12345");
    	Thread.sleep(2000);
    	driver.findElement(By.id("login")).click();
    	Thread.sleep(2000);
    }
}
