package basictest;

import org.testng.annotations.DataProvider;

public class datprovider {
	@DataProvider(name="items")
	public Object[][] productsearch()
	{
		return new Object [][] {{"shoe"},{"watch"},{"phone"}};
	}
	@DataProvider(name="username")
	public Object[][] methodData1()
	{
		return new Object [][] {{"exp@gmail.com","pass1"},{"amp@gmail.com","pass2"},{"exmp@gmail.com","pass3"}};
	}
}
