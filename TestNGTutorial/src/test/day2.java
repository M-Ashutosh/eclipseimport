package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
/*	@BeforeTest
    public void before()
    {
   	 System.out.print("Before demo");
    }*/

	@Test
	public static void XMLDemo() 
	{
     System.out.println("Hello");
	}
	@Test
     public void check()
     {
    	 System.out.println("This is to check TestNG demo");
     }
	@Test
    public void check1()
    {
   	 System.out.println(0);
    }
	/*@AfterTest
    public void after()
    {
   	 System.out.print("This is to check After annotation");
    }*/
}
