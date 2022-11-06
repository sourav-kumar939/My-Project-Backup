package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	@org.testng.annotations.Test
		public void Test() throws Exception{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
		Actions action=new Actions(driver);
		
		action.contextClick(right_click).build().perform();
	}

}
