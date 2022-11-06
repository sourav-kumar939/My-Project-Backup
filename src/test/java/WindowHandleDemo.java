import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String parent_window=driver.getWindowHandle();             // Parent window with variable(parent_window)
		System.out.println("Parent Window is:-"+parent_window);

		WebElement Element=driver.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js= (JavascriptExecutor)driver;          // This is done to Scroll the page-------Very Important
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		 driver.findElement(By.id("newWindowBtn")).click();
		 
		 Set<String> handles=driver.getWindowHandles();
		 for(String handle:handles) {                               // Child window is (handle)
			 System.out.println(handle);
			 
			 if(!handle.equals(parent_window)) {
				 driver.switchTo().window(handle);     // This done when we need to get or do something in the child window
				 driver.manage().window().maximize();
				 
				 driver.findElement(By.id("firstName")).sendKeys("Saurav Kumar");
				 Thread.sleep(5000);
				 driver.close();
			  }
			}
		     
		 driver.switchTo().window(parent_window);                // This done to get back to the Parent window
		 driver.findElement(By.id("name")).sendKeys("Ashwani");
		
		
		
	}

}
