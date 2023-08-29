package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		try
		{
			driver.findElement(By.name("fake")).click();
		}
		catch(Exception e)
		{
			System.out.println("Element is not found/Nosuch element exception");
			System.out.println("Hello");
			
			throw(e);
		}
		
		System.out.println("Hii");

	}

}
