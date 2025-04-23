package basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	WebDriver driver;
@BeforeMethod
public void beforemethod()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().window().maximize();
}
@Test
public void verifytitle()
{
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	String expectedtitle="Obsqura Testing";
	Assert.assertEquals(actualtitle,expectedtitle);
}
@Test
public void verifyhead()
{
	WebElement actualhead=driver.findElement(By.xpath("//label[contains(text(),'Enter Message')]"));
	String getheader=actualhead.getText();
	System.out.println(getheader);
	String expectedhead="Enter Message";
	Assert.assertEquals(actualhead,expectedhead);
}
	
}




