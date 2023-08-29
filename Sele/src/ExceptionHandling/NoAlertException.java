package ExceptionHandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertException 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		try 
		{
			driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
}
