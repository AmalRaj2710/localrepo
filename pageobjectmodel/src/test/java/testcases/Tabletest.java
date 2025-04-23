package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import basepackage.baseclass;
import pages.Tablepage;

public class Tabletest extends baseclass {

	@Test
	public void verifynames()
	{
		Tablepage tablepage=new Tablepage (driver);
		tablepage.clickontablelink();
		
		List<String> actualnames=new ArrayList<String>();
		actualnames=tablepage.getnames();
	}
	}
