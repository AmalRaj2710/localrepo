package webelementmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownselection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement selecttag=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(selecttag);
		select.selectByIndex(2);
		select.selectByValue("search-alias=aps");
		select.selectByVisibleText("Apps & Games");
		List<WebElement>selectelements=select.getOptions();
		int s=selectelements.size();
			for(WebElement element:selectelements)
		{
	System.out.println(element.getText());
		}
	}

}
