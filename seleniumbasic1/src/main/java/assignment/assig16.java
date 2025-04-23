package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assig16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement user=driver.findElement(By.xpath("//button[@id='save']"));
		wait.until(ExpectedConditions.elementToBeClickable(user));
		user.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
		WebElement name=driver.findElement(By.xpath("//h5[@class='card-title']"));
		String s=name.getText();
			System.out.println(s);	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']//img")));
			WebElement image=driver.findElement(By.xpath("//div[@class='card text-center']//img"));
			boolean displayed=image.isDisplayed();
			System.out.println(displayed);

	}

}
