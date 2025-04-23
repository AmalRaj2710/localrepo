package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement xpath=driver.findElement(By.xpath("//input[contains(@id,'check-box-one')]"));
		xpath.click();
		String s=xpath.getTagName();
		System.out.println(s);
		int c=xpath.getLocation().x;
		System.out.println(c);
		int co=xpath.getLocation().y;
		System.out.println(co);
		//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@class='nav-input nav-progressive-attribute']

	}

}
