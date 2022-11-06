package WebDriverMethods.HandleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerDemo {
	
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");

	}

	@Test
	public void m1() throws InterruptedException {
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.yahoo.com')]")).click();
		
		Set<String> childs = driver.getWindowHandles();
		
		for(String child:childs) {
			
			String title=driver.switchTo().window(child).getTitle();              // It is used when two or more windows are there and you need to switch between them
			
			if(!parent.equals(child)) {
				
				driver.switchTo().window(child);
				driver.findElement(By.id("yschsp")).sendKeys("Cars",Keys.ENTER);
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[text()=' Click this link to start  Session in same window']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		String parent = driver.getWindowHandle();
//
//		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
//
//		Set<String> allWindow = driver.getWindowHandles();
//		int count = allWindow.size();
//		System.out.println(count);
		
//		for (String windows : allWindow) {
//			if(windows!=parent) {
//				driver.switchTo().window(windows);
//				//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Saurav");
//				Thread.sleep(3000);
//				driver.close();
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(String handle:allWindow) {                               // Child window is (handle)
//			 System.out.println(handle);
//			 
//			 if(!handle.equals(parent)) {
//				 driver.switchTo().window(handle);     // This done when we need to get or do something in the child window
//				 driver.manage().window().maximize();
//				 
//				 driver.findElement(By.name("q")).sendKeys("Saurav Kumar");
//				 Thread.sleep(5000);
//				 driver.close();
//				 
//			  }
//			}

	}

}
