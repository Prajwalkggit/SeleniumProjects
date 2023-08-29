package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectalloptions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/prajwal.kg/Downloads/Dropdown.html");
		WebElement ele = driver.findElement(By.id("Aahar"));
		Select s = new Select(ele);
	    Thread.sleep(2000);
	    List<WebElement> options = s.getOptions();
	    int count = options.size();
	    System.out.println(count);
	    Thread.sleep(5000);
	    for(int i=0;i<count;i++)
	    {
	    	s.selectByIndex(i);
	    }
	    Thread.sleep(5000);
	    s.deselectAll();

	}

}
