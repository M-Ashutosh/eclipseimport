package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
/*	@BeforeTest
    public void before()
    {
   	 System.out.print("Before demo");
    }*/
	
	@BeforeClass
	public void befrclas()
	{
		System.out.println("Executed before any test in the class");
	}
    @AfterTest
    public void after() 
	{
     System.out.println("I will execute last");
	}
    @Parameters({"URL"})
    @Test(groups={"testinggroup"})
	public void parameterization(String urlname) 
	{
     System.out.println(urlname);
	}
	@Test
	public void kTestday4() 
	{
     System.out.println("Test for day6");
	}
	@Test(dependsOnMethods={"kTestday4"})
     public void etest()
     {
    	 System.out.println("This is to check TestNG demo for day6");
     }
	@Test(groups={"testinggroup"})
    public void atest1()
    {
   	 System.out.println("day6 output");
    }
	@BeforeSuite
    public void BFSuite()
    {
   	 System.out.println("I am on top of suite");
    }
	@AfterClass
	public void aftrclas()
	{
		System.out.println("Executed after all test in the class");
	}
}
