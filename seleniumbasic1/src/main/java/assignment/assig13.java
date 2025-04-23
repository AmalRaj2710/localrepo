package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		List<WebElement> checkbox=driver.findElements(By.xpath("//div[@class='form-group']//div//input"));
int size1=checkbox.size();
for(int i=0;i<size1;i++)
{
	checkbox.get(i).click();
	System.out.println("selected");
}
	}
	}

