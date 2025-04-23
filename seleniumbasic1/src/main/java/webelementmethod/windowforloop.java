package webelementmethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowforloop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();
		WebElement window=driver.findElement(By.xpath("//button[@id='new-tab-button']"));
		window.click();
		String parentwindow=driver.getWindowHandle(); 
		System.out.println(parentwindow);
		window.click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		for(String windowid:windows)
		{
			if(!parentwindow.equals(windowid))
			{
				driver.switchTo().window(windowid);
				break;
			}
		}
		WebElement formy=driver.findElement(By.xpath("	//h1[text()='Welcome to Formy']"));
		System.out.println(formy.getText());
		driver.close();
		driver.switchTo().window(parentwindow);
	}

}
