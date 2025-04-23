package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
	WebElement first=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	WebElement second=driver.findElement(By.xpath("	//button[@class='btn btn-warning']"));
	WebElement third=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));

		first.click();
		 String s=driver.switchTo().alert().getText();
	     System.out.println(s);
	     driver.switchTo().alert().accept();
	     second.click();
	     driver.switchTo().alert().dismiss();
	     third.click();
	     driver.switchTo().alert().sendKeys("hello");
	     driver.switchTo().alert().accept();

	}

}
