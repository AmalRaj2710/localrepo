package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actionsmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Actions action=new Actions(driver);
		action.clickAndHold().build().perform();
		action.release().build().perform();
		action.sendKeys(search, "mobile").build().perform();
		action.keyDown(search, Keys.ENTER).build().perform();
		
	
	}

}
