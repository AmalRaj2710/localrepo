package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

public	WebDriver driver;
@BeforeMethod
public void launchbrowser()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/index.php");
	driver.manage().window().maximize();
}
}
