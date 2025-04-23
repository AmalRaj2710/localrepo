package basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataproviderexp {
WebDriver driver;
SoftAssert softassert=new SoftAssert();
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "items",dataProviderClass = DataProvider.class)
	public void productsearch(String product)
	{
		WebElement inputtext=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		inputtext.sendKeys("mobile");
	}
	
	
	}
