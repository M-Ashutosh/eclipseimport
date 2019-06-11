package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day7 {
	
/*	@BeforeTest
    public void before()
    {
   	 System.out.print("Before demo");
    }*/
	
	@Parameters({"URL","Key"})
	@Test
	public void testclas(String urlname, String keyname)
	{
		System.out.println("Executed before any test in the class");
		System.out.println(urlname);
		System.out.println(keyname);
	}

}
