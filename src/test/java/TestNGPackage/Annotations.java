package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite method :1");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method :6");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class:7");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test:8");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class:3");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test method :2");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite:9");
	}
	
	

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method:4");
	}
	
	@Test
	public void test()
	{
		System.out.println("test :5");
	}
	
	
}
