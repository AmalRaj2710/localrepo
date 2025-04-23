package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement mouse=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action=new Actions(driver);
		action.moveToElement(mouse).build().perform();
		action.click(mouse).perform();//

	}

}
//https://demo.guru99.com/test/simple_context_menu.html  --->2button webelement declare cheyaan
