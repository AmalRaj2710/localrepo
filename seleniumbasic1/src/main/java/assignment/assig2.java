package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig2 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://selenium.qabible.in/simple-form-demo.php");
			WebElement message=driver.findElement(By.id("single-input-field"));
			message.sendKeys("hello");
			WebElement button=driver.findElement(By.id("button-one"));
			button.click();

	}

}
