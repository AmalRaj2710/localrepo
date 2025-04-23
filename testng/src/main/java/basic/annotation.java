package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Executing before suite");
	}
@BeforeTest
public void beforetest()
{
	System.out.println("Executing before test");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("Executing before class");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("Executing before suit");
}
@Test
public void testcases()
{
	System.out.println("Executing testcases");
}
@Test

public void testcases1()
{
	System.out.println("Executing testingcases");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("Executing after suite");
}
@AfterTest
public void aftertest()
{
	System.out.println("Executing after test");
}
@AfterClass
public void afterclass()
{
	System.out.println("Executing after class");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("Executing after method");
}
}
