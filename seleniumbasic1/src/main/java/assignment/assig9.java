package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement green=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		WebElement red=driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']"));
		WebElement yellow=driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		
String colour=green.getCssValue("background-color");
System.out.println(colour);
String font=green.getCssValue("color");
System.out.println(font);

String colour2=red.getCssValue("background-color");
System.out.println(colour2);
String font2=green.getCssValue("color");
System.out.println(font2);

String colour3=yellow.getCssValue("background-color");
System.out.println(colour3);
String font3=green.getCssValue("color");
System.out.println(font3);


	}

}
