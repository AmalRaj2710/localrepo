package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inputformpage {
	WebDriver driver;
	By input=By.xpath("(//a[@class='nav-link'])[2]");
	By message=By.xpath("//div[@id='message-one']");
	By singleinput=By.xpath("//div[contains(text(),'Single Input Field')]");
	public inputformpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickoninputform()
	{
		WebElement input1=driver.findElement(input);
		input1.click();
	}
	public String getmessage()
	{
		WebElement message1=driver.findElement(message);
		return message1.getText();
	}
	public String singleinputfield()
	{
		WebElement singleinput1=driver.findElement(singleinput);
		return singleinput1.getText();
	}
}
