package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("drop1"));
		
		Select select=new Select(element);
		
		select.selectByIndex(2);
		Thread.sleep(5000);
		select.selectByValue("def");
		Thread.sleep(5000);
		select.selectByVisibleText("doc 3");
		Thread.sleep(5000);
		
	}

}

