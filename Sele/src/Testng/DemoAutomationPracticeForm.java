package Testng;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoAutomationPracticeForm extends DemoWebsiteGeneric 
{
	
	@Test
	public void test() throws InterruptedException
	{
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Demo");
		Thread.sleep(1000);
		//Enter last name
		driver.findElement(By.name("lastname")).sendKeys("Test");
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
		
		//select gender
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(1000);
		//select experience
		driver.findElement(By.id("exp-1")).click();
		Thread.sleep(1000);
		//Enter date
		driver.findElement(By.id("datepicker")).sendKeys("16/06/1998");
		Thread.sleep(1000);
		//Select profession
		driver.findElement(By.id("profession-1")).click();
		Thread.sleep(1000);
		//select automation tool
		driver.findElement(By.id("tool-2")).click();
		Thread.sleep(1000);
		//select continent
		driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Australia']")).click();
        Thread.sleep(1000);
        //select selenium commands 
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[contains(text(),'WebElement Commands')]")).click();
        Thread.sleep(1000);
        
        WebElement file = driver.findElement(By.xpath("//input[@id='photo']"));
		file.sendKeys("C:\\Users\\prajwal.kg\\Videos\\Profile.PNG");
		System.out.println("File uploaded successfully");
		Thread.sleep(1000);
		
		driver.findElement(By.id("submit")).click();
		System.out.println("Details updated successfully");
	}

}
