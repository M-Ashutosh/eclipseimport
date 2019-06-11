package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day8 {
	
	@Test(dataProvider="getData")
	public void parametertesting(String username, String password)
	{
		System.out.println("Executed before any test in the class");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]= "firstuser";
		data[0][1]= "firstpassword";
		
		data[1][0]= "seconduser";
		data[1][1]= "secondpassword";
		
		data[2][0]= "thirduser";
		data[2][1]= "thirdpassword";
		return data;
	}
}

