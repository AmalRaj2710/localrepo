package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.baseclass;
import pages.inputformpage;

public class inputformtest extends baseclass {
	inputformpage inputform;
	
	@Test
	public void verifyyourmessageisdisplayedornot()
	{
		inputform=new inputformpage(driver);
		inputform.clickoninputform();
		String expectedmessage="your message";
		String actualmessage=inputform.getmessage();
		Assert.assertEquals(expectedmessage, actualmessage);
	}
}
