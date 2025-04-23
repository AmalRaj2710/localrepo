package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pages.homepage;

public class hometest extends baseclass  {
	homepage page;
	@Test
public void verifylogo()
{
		page =new homepage(driver);
		Assert.assertTrue(page.islogodisplayed());
}
	
}
//element.getDomProperty("propertyName");