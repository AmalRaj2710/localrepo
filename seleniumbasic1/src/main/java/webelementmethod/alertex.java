package webelementmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement jsalert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		WebElement jsconfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		WebElement jspromt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
jsalert.click();
driver.switchTo().alert().accept();
jsconfirm.click();
     String s=driver.switchTo().alert().getText();
     System.out.println(s);
     driver.switchTo().alert().dismiss();
     
     jspromt.click();
     driver.switchTo().alert().sendKeys("hello");
     driver.switchTo().alert().accept();
	}
	
	

}
