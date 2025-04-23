package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class assig20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td"));
		int size1=row.size();
		for(int i=0;i<size1;i++)
		{
			String data1=row.get(i).getText();
			System.out.println(data1);
		}
		List<WebElement> row2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[8]//td"));
		int size2=row2.size();
		for(int i=0;i<size2;i++)
		{
			String data2=row2.get(i).getText();
			System.out.println(data2);
		}

	}

}
