package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class product {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement key=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       // key.sendKeys("mobile"+Keys.ENTER);
		key.sendKeys("mobile");
		key.sendKeys(Keys.BACK_SPACE);
		key.sendKeys(Keys.chord(Keys.CONTROL,"A"));
		key.sendKeys(Keys.BACK_SPACE);
	}

}
