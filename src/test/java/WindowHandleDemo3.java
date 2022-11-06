import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo3 {
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window:-"+parent);
		
		WebElement Element=driver.findElement(By.xpath("//img[contains(@alt,'LinkedIn OrangeHRM group')]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;          // This is done to Scroll the page-------Very Important
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		driver.findElement(By.xpath("//img[contains(@alt,'LinkedIn OrangeHRM group')]")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on Facebook')]")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on youtube')]")).click();
		
		Set<String> windown_handlers=driver.getWindowHandles();
		
		// This done to get all the windows Title-----------------------------------
		for(String window:windown_handlers) {
			String title=driver.switchTo().window(window).getTitle();
			System.out.println(title);
			
			if(title.equals("Sign Up | LinkedIn")) {
				
				driver.switchTo().window(window);
				driver.close();
			}
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
