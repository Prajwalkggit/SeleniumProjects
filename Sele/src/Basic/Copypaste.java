package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypaste {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/prajwal.kg/Downloads/Auto4.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));	
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"c");
		WebElement ele1 = driver.findElement(By.xpath("//input[@value='xyz']"));
		Thread.sleep(2000);
		ele1.clear();
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"v");
		

	}

}
