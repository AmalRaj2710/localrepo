package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement window=driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		window.click();
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>iterator=windows.iterator();
		while(iterator.hasNext())
		{
			String windowid=iterator.next();
			if(!parentwindow.equals(windowid))
			{
				driver.switchTo().window(windowid);
				break;
			}
		}
		WebElement print=driver.findElement(By.xpath("//span[text()='Create new account']"));
		System.out.println(print.getText());
	driver.close();
	driver.switchTo().window(parentwindow);
	}
}
