package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webelementmethod.webelement11;

public class assig15 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement start=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		wait.until(ExpectedConditions.elementToBeClickable(start));
		start.click();
		
	//	WebElement cancel=driver.findElement(By.xpath("//button[@id='downloadButton']"));
	//	wait.until(ExpectedConditions.invisibilityOf(cancel));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Complete!')]")));
		WebElement complete=driver.findElement(By.xpath("//div[contains(text(),'Complete!')]"));
		String s=complete.getText();
			System.out.println(s);
	}

}
