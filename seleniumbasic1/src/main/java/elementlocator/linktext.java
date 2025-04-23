package elementlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//webElement linktext=driver.findElement(By.linkText("forgotten password"));
//linktext.click();
	//	WebElement linktext =driver.findElement(By.linkText("forgotten password"));
	//	linktext.click();
		WebElement partial =driver.findElement(By.partialLinkText("forgotten password"));
		partial.click();
	}

}
