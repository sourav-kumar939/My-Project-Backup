package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeObject {
	
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		actions.clickAndHold(resize).moveByOffset(100, 40).release().build().perform();
		
	}
	

}
