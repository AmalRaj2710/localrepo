package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/table-sort-search.php");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
search.sendKeys("Ashton cox");
List<WebElement> row=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td"));
int size=row.size();
for(int i=0;i<size;i++)
{
	String data1=row.get(i).getText();
	System.out.println(data1);
}
	}

}
