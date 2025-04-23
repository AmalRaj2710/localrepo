package webelementmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tableexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		WebElement office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
		String s=office.getText();
				System.out.println(s);
		
		WebElement age=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[4]"));
		String a=age.getText();
				System.out.println(a);

				List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
				int size=table.size();
				for(int i=0;i<size;i++)
				{
					String data=table.get(i).getText();
					System.out.println(data);
				}
				
				WebElement tabledata=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[4]"));
				String t=office.getText();
				System.out.println(t);
				
	List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	int size2=column.size();
	for(int i=0;i<size2;i++)
	{
		String data1=column.get(i).getText();
		System.out.println(data1);
	}
	List<WebElement> details=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[3]//td"));
	int size3=details.size();
	for(int i=0;i<size3;i++)
	{
		String data2=details.get(i).getText();
		System.out.println(data2);
	}
	List<WebElement> details2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td"));
	int size4=details2.size();
	for(int i=0;i<size4;i++)
	{
		String data3=details2.get(i).getText();
		System.out.println(data3);
	}
}
	}


