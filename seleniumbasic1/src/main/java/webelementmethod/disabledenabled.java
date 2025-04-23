package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disabledenabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		WebElement disabled=driver.findElement(By.xpath("//input[@id='disabledInput']"));
		WebElement input=driver.findElement(By.xpath("//input[@id='input']"));
		boolean displayed1=disabled.isDisplayed();
		System.out.println(displayed1);
		boolean displayed2=input.isDisplayed();
		System.out.println(displayed1);
		boolean enabled1=disabled.isEnabled();
		System.out.println(enabled1);
		boolean enabled2=input.isEnabled();
		System.out.println(enabled2);
		
	}

}
