package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkboxexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
boolean check1=checkbox1.isSelected();
System.out.println(check1);
boolean check2=checkbox2.isSelected();
System.out.println(check2);
if(!check1)
{
	checkbox1.click();
}
if(check2==false)
{
	checkbox2.click();
}
boolean displayed1=checkbox1.isDisplayed();
System.out.println(displayed1);
boolean enabled1=checkbox1.isEnabled();
System.out.println(enabled1);
boolean displayed2=checkbox2.isDisplayed();
System.out.println(displayed2);
	}

}
