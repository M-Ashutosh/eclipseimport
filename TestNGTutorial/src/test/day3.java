package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	
/*	@BeforeTest
    public void before()
    {
   	 System.out.print("Before demo");
    }*/
	@BeforeMethod
	public void befrmethod()
	{
		System.out.println("I will execute before each method");
	}
	@Test
	public static void Test() 
	{
     System.out.println("Test for day3");
	}
	@Test
     public void test()
     {
    	 System.out.println("This is to check TestNG demo");
     }
	@Test(groups={"testinggroup"})
    public void test1()
    {
   	 System.out.println("day3 output");
    }
	/*@AfterTest
    public void after()
    {
   	 System.out.print("This is to check After annotation");
    }*/
	@AfterMethod
	public void aftrmethod()
	{
		System.out.println("I will execute after each method");
	}
}
