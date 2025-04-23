package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//li[@id='fourth'][1]//a[@class='button button-orange']"));
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		
		
	

	}

}
