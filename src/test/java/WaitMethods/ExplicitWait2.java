package WaitMethods;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
	@org.testng.annotations.Test
	public void Test()throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.omayo.blogspot.com");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);      // Deprecated in selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    // This is new Implicit Wait--------------------
		
		String parent_window=driver.getWindowHandle();
		
		Actions actions=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Dropdown']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",button );
		
		button.click();
		WebElement dropdown_button=driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));          //This is Explicit Wait----------------------
		wait.until(ExpectedConditions.visibilityOf(dropdown_button));
		
		//dropdown_button.click();
		
		
        
       // actions.moveToElement(dropdown_button).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
        actions.moveToElement(dropdown_button).keyDown(Keys.SHIFT).click().keyUp(Keys.SHIFT).build().perform();
        Set<String> child_window= driver.getWindowHandles(); 
		
        for(String child:child_window) {
        	
        	if(!child.equals(parent_window)) {
        		driver.switchTo().window(parent_window);
        		driver.close();
        	}
        }
        
        
	}

}
