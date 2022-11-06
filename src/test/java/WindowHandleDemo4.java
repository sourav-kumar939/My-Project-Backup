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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo4 {
	
WebDriver driver;
	
	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		Actions action=new Actions(driver);
		
		String parent=driver.getWindowHandle();
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		
		
		Set<String> childs=driver.getWindowHandles();
		
		
		for(String child:childs) {
			String title=driver.switchTo().window(child).getTitle();
			System.out.println(title);
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//div[@class='dropdown']//textarea")).sendKeys("Hello");
			Thread.sleep(3000);
			if(title.equals("Selenium Webdriver Tutorial - Selenium Tutorial for Beginners")) {
				driver.switchTo().window(child);
				WebElement el=driver.findElement(By.xpath("//a[text()='XPath plugin for Chrome']"));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", el);
			}
				
				
		}
		
	}
	

}
