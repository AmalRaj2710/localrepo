package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit.click();
		List<WebElement>selectelements=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		int s=selectelements.size();
			for(int i=0;i<s;i++)
		{
				String str=selectelements.get(i).getText();
	System.out.println(str);
		}

	}

}
