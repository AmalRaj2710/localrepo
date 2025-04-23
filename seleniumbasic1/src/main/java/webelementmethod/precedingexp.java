package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class precedingexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		String checkbox="Check Box Two";           //dynamic xpath
		WebElement proceding=driver.findElement(By.xpath("//label[contains(text(),'"+checkbox+"')]//preceding-sibling::input"
	));
		proceding.click();
		

	}

}
