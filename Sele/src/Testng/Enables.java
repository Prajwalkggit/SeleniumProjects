package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enables 
{
     @Test(enabled=false)
    	 public void Tc1()
    	 {
    		 Reporter.log("1",true);
    	 }
     @Test
	 public void Tc2()
	 {
		 Reporter.log("2",true);
	 }
     
}
