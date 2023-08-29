package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
	
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File folder = new File("C:\\Users\\prajwal.kg\\Pictures\\Screenshots\\flipkartscreenshot.jpeg");
		Files.copy(src, folder);
		
		driver.close();

	}

}
