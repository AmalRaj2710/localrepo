package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig6 {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://selenium.qabible.in/radio-button-demo.php");
			driver.manage().window().maximize();
		WebElement radio1=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement radio2=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean enabled1=radio1.isEnabled();
		System.out.println(enabled1);
		boolean enabled2=radio2.isEnabled();
		System.out.println(enabled2);
			radio1.click();	
		boolean select=radio1.isSelected();
		System.out.println(select);
		boolean select2=radio2.isSelected();
		System.out.println(select2);
	}

}
