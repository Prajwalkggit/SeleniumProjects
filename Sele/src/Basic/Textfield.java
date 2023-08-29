package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/prajwal.kg/Downloads/Auto2.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b = ele.isDisplayed();
		System.out.println(b);
		if(b)
		{
			System.out.println("textbox is displayed");
		}
		else
		{
			System.out.println("textbox is not displayed");
		}

	}

}
