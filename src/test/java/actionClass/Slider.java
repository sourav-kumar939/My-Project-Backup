package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	@org.testng.annotations.Test
	public void Test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Actions actions = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//div[@id='blue']/span"));
		
		actions.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
		
	}

}
