package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdeselect {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/prajwal.kg/Downloads/Dropdown.html");
		WebElement ele = driver.findElement(By.id("Aahar"));
	    Select s = new Select(ele);
	    s.selectByIndex(1);
	    s.selectByValue("p");
	    s.selectByVisibleText("palav");
	    boolean b = s.isMultiple();
	    System.out.println(b);
	    s.deselectAll();

	}

}
