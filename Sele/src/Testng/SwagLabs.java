package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SwagLabs extends Generic
{
	
	@Test
	public void testone() throws InterruptedException
	{
		//driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		System.out.println("User is logged into application");
		
		//add the product to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		Thread.sleep(3000);
		System.out.println("User has added the product to the cart");
		
		//checkout the product
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("TesterDemo");
		Thread.sleep(2000);	
		driver.findElement(By.id("last-name")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("postal-code")).sendKeys("577006");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		System.out.println("product is checkedout");
		
		//Complete the booking of the product
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		System.out.println("Product is booked");
		
	}

}
