package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/prajwal.kg/Downloads/Auto2.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		//ele.clear();
		ele.sendKeys(Keys.CONTROL+"a");//select all the data
		Thread.sleep(3000);
		ele.sendKeys(Keys.DELETE);//clear all the data
	}

}
