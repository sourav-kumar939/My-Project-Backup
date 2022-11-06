import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));           //----By WebElement element--------------                      
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.switchTo().frame("iframeResult");                           //----By Id or Name--------------
//		driver.findElement(By.id("//button[text()='Try it']")).click(); 
		
		//driver.switchTo().frame(frameElement)
	}

}
