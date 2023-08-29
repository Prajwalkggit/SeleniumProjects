package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Noofoptions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/prajwal.kg/Downloads/Dropdown.html");
		WebElement ele = driver.findElement(By.id("Aahar"));
	    Select s = new Select(ele);
	    Thread.sleep(4000);
	    List<WebElement> options = s.getOptions();
	    int count = options.size();
	    System.out.println(count);

	}

}
