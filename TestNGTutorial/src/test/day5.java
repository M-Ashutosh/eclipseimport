package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day5 {
	
/*	@BeforeTest
    public void before()
    {
   	 System.out.print("Before demo");
    }*/
    @AfterTest
    public void after() 
	{
     System.out.println("I will execute last");
	}
	@Test
	public static void Testday5() 
	{
     System.out.println("Test for day5");
	}
	@Test
     public void test()
     {
    	 System.out.println("This is to check TestNG demo for day5");
     }
	@Test(groups={"testinggroup"})
    public void test1()
    {
   	 System.out.println("day5 output");
    }
	@BeforeSuite
    public void BFSuite()
    {
   	 System.out.println("I am on top of suite");
    }
}
