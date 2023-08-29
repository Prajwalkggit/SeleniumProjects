package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ParaBankDemo extends ParaBankGeneric 
{

	@Test
	public void demo() throws InterruptedException
	{
//		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
//		
//		//Enter the details
//		driver.findElement(By.id("customer.firstName")).sendKeys("Shaun");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.lastName")).sendKeys("Beast");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.address.street")).sendKeys("Streer 10,#123");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.address.city")).sendKeys("Shimoga");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.address.state")).sendKeys("Karnataka");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.address.zipCode")).sendKeys("577003");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9867392192");
//		Thread.sleep(2000);
//		driver.findElement(By.id("customer.ssn")).sendKeys("328991");
//		Thread.sleep(2000);
		
		//Enter username and password
//		driver.findElement(By.id("customer.username")).sendKeys("Shaun");
//		Thread.sleep(1000);
//		driver.findElement(By.id("customer.password")).sendKeys("Shaun@123");
//		Thread.sleep(1000);
//		driver.findElement(By.id("repeatedPassword")).sendKeys("Shaun@123");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@class='button']) [2]")).click();
//		System.out.println("User has registered successfully");
	
	
		driver.findElement(By.name("username")).sendKeys("Shaun");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Shaun@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='button']) [1]")).click();
	
		//Create new account
		driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='type']"));
		Select s = new Select(ele);
		s.selectByVisibleText("SAVINGS");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
		System.out.println("User has created account successfully");

		
		//Account overview
		driver.findElement(By.xpath("//a[contains(text(),'Accounts Overview')]")).click();
		Thread.sleep(4000);
	    
  
		//Transfer Funds
		driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("1800");
		Thread.sleep(2000);
		//From Account
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		Select s1= new Select(ele1);
		s1.selectByValue("18006");
		Thread.sleep(2000);
		//To Account
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='toAccountId']"));
		Select s2= new Select(ele2);
		s1.selectByValue("18117");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
		System.out.println("Amount transferred successfully");
		
	
		//Bill Pay
		driver.findElement(By.xpath("//a[contains(text(),'Bill Pay')]")).click();
		Thread.sleep(2000);
		//Enter payee information
		driver.findElement(By.name("payee.name")).sendKeys("Prajju");
		Thread.sleep(2000);
		driver.findElement(By.name("payee.address.street")).sendKeys("3rd main");
		Thread.sleep(2000);
		driver.findElement(By.name("payee.address.city")).sendKeys("Davanagere");
		Thread.sleep(2000);
		driver.findElement(By.name("payee.address.state")).sendKeys("Karnataka");
		Thread.sleep(2000);
		driver.findElement(By.name("payee.address.zipCode")).sendKeys("577006");
		Thread.sleep(2000);
		driver.findElement(By.name("payee.phoneNumber")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("payee.phoneNumber")).sendKeys("7965435271");
		Thread.sleep(2000);
		driver.findElement(By.name("payee.accountNumber")).sendKeys("18006");
		Thread.sleep(2000);
		driver.findElement(By.name("verifyAccount")).sendKeys("18006");
		Thread.sleep(2000);
		driver.findElement(By.name("amount")).sendKeys("500");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        
		WebElement ele3 = driver.findElement(By.name("fromAccountId"));
		Select s3= new Select(ele3);
		s3.selectByValue("18117");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
		System.out.println("Bill payed successfully");
    
		 //Find transaction
		 driver.findElement(By.xpath("//a[contains(text(),'Find Transactions')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='criteria.amount']")).sendKeys("600");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@class='button']) [4]")).click();
		 Thread.sleep(2000);
		 System.out.println("Find transaction flow completed successfully");
	 
		 //update contact info
		 driver.findElement(By.xpath("//a[contains(text(),'Update Contact Info')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("570846");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 Thread.sleep(2000);
		 System.out.println("Contact info updated successfully");	
	    
		 //Apply for loans
		 driver.findElement(By.xpath("//a[contains(text(),'Request Loan')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10000");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='downPayment']")).sendKeys("500");
		 Thread.sleep(2000);
		 WebElement ele4 = driver.findElement(By.xpath("//select[@id='fromAccountId']"));
		 Select s4= new Select(ele4);
		 s4.selectByValue("18006");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 Thread.sleep(2000);
		 System.out.println("Loan applied successully");
		
		 //Logout from the application
		 driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		 System.out.println("-----------User has logged out successfully from the application----------");
		
}
	
}
