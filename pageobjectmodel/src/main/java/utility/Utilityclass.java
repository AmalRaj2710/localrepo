package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Utilityclass {
 public String gwtattribute(WebElement element ,String attribute )
 {
	return element.getAttribute(attribute) ;
 }
 public List<String> gettextofelements(List<WebElement> elements)
	{
	 List<String> data=new ArrayList<String>();
	 for(WebElement element:elements)
		{
			data.add(element.getText());
		}
		return data;	}
}
