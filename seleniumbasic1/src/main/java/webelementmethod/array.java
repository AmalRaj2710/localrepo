package webelementmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class array {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	
		List<WebElement> arrayelements=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		int s=arrayelements.size();
		System.out.println(s);
		for(int i=0;i<s;i++)
		{
			String data=arrayelements.get(i).getText();
			System.out.println(data);
			String css=arrayelements.get(i).getCssValue("background-color");
			System.out.println(css);
		}
		for(WebElement element:arrayelements)
				{
			System.out.println(element.getText());
				}
	}

}
