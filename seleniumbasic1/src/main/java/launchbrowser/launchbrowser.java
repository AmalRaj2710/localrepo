package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launchbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		String s=driver.getTitle();
		System.out.println(s);
		String u=driver.getCurrentUrl();
	driver.get(u);
		System.out.println(u);
//driver.quit();
		driver.close();
	
	}

}
