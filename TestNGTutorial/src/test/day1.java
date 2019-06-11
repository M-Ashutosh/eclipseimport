package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterSuite
    public void AFT()
    {
   	 System.out.println("I am on bottom of the suite");
    }

	@Test
	public static void Demo() 
	{
     System.out.println("Hello");
	}
	@Test
     public void verify()
     {
    	 System.out.println("This is to check TestNG demo");
     }
	@Test
    public void verify1()
    {
   	 System.out.println(0);
    }
	@AfterTest
    public void after()
    {
   	 System.out.println("This is to check After annotation last executed");
    }
}
