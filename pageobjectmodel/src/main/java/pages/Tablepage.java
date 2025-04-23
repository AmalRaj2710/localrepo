package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import utility.Utilityclass;

public class Tablepage {
	
	Utilityclass utilityclass=new Utilityclass();
	WebDriver driver;
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	private WebElement tablelink;
	@FindBy(xpath="//table[@id='dtBasicExample']//tbody//tr//td[1]")
	
	List<WebElement> tablenames;

	public Tablepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickontablelink()
	{
		tablelink.click();
	}
	public void getnames()
	{
		List<String> names=new ArrayList<String>();
		names=utilityclass.gettextofelements(tablenames);
		System.out.println(names);
	}

}
