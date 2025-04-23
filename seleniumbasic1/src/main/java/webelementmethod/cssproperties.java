package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssproperties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement css=driver.findElement(By.xpath("//button[@id='button-one']"));
String colour=css.getCssValue("background-color");
System.out.println(colour);
String font=css.getCssValue("color");
System.out.println(font);
String size=css.getCssValue("font-size");
System.out.println(size);
String style=css.getCssValue("font-style");
System.out.println(style);


	}

}
