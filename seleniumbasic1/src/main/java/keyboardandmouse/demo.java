package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement btn1=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(btn1).build().perform();
		
		WebElement btn2=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.contextClick(btn2).build().perform();
		
		action.doubleClick(btn1).build().perform();
		action.doubleClick(btn2).build().perform();
		
		
	}

}
