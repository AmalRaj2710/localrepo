package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement tooltip=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String attr1=tooltip.getAttribute("title");
	System.out.println(attr1);
	WebElement tooltip2=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
	String attr2=tooltip2.getAttribute("title");
System.out.println(attr2);

	}

}
