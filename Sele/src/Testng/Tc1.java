package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1 
{
    @Test
    public void test1()
    {
    	Reporter.log("1",true);
    }
    @Test
	public void test2()
	{
		Reporter.log("2",true);
	}
    @Test
   	public void test3()
   	{
   		Reporter.log("3",true);
   	}
}

	


