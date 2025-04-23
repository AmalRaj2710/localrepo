package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javascriptex {

	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement java=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;//sytax of typecasting
		js.executeScript("window.scrollBy(0,1000)");//for scrolling command
		WebElement scroll=driver.findElement(By.xpath("//a[@href='https://www.amazonpay.in/merchant']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		js.executeScript("arguments[0].click();",scroll);//click using javascript
	}

}
