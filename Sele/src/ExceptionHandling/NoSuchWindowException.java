package ExceptionHandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchWindowException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\prajwal.kg\\eclipse-workspace\\Sele\\server\\chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		//driver.switchTo().window("null");//No window exception
		
		driver.switchTo().frame(12);//No such frame exception

	}

}
