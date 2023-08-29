package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.matrimony.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("RELIGION"));
		Select s = new Select (ele);
        List<WebElement> options = s.getOptions();
        int size = options.size();
        System.out.println(size);
	}

}
