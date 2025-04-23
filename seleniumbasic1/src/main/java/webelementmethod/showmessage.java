package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class showmessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement xpath=driver.findElement(By.xpath("(//button[@id='button-one'])"));
		String s=xpath.getText();
		System.out.println(s);
		WebElement xpath1=driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])[1]"));
		String u=xpath1.getText();
		System.out.println(u);

	}

}
