package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://190.210.184.180/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("\\div[.=' Login now '")).click();
		
		

	}

}
