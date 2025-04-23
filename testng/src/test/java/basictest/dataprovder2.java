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

public class dataprovder2 {
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
		@BeforeMethod
		public void beforemethod()
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://facebook.com");
			driver.manage().window().maximize();
		}
		@Test(dataProvider = "items",dataProviderClass = DataProvider.class)
		public void verifyusernameandpass(String email ,String Password)
		{
			WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys(email);
			
			WebElement passwords=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
			passwords.sendKeys(Password);
		}
}
