package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
		WebDriver driver;
		By logo=By.xpath("(//img[@src='images/logo.png'])[1]");

		//int a=6;
		
	public homepage(WebDriver driver)
	{
	this.driver=driver;
	}
	public boolean islogodisplayed()
	{
		WebElement element=driver.findElement(logo);
		return element.isDisplayed();
	}
	
	
	//public void printtitle()
	
	//{
	//	String printtitle=driver.getTitle();
	//	System.out.println(printtitle);
		//int a=10;
	//}
}
