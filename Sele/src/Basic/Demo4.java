package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		for(WebElement we:ele)
		{
			String text = we.getText();
			System.out.println(text);
		}
	}

}
