import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe2 {
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("name")).sendKeys("Saurav");   //Main Frame
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));  //Frame 3
		driver.switchTo().frame(driver.findElement(By.id("frm1")));   //Inside Frame 3 I'm in frame 1
		
		
		Select select=new Select(driver.findElement(By.id("selectnav1")));
		
		Thread.sleep(5000);
		
		select.selectByVisibleText("-- Selenium");
		
		driver.switchTo().parentFrame(); // Come back to input the text (for coming back and input the text we have to use parentFrame()method) 
		Thread.sleep(5000);
		
		driver.findElement(By.id("name")).sendKeys("Gaurav");
		
		driver.switchTo().defaultContent(); //Back to Main Frame
		Thread.sleep(5000);
		
		driver.findElement(By.id("name")).sendKeys("@Ashwani");
		
		
		
		
		
		
		
		
//        driver.findElement(By.id("name")).sendKeys("Saurav");
//		
//		WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frm3']"));
//		driver.switchTo().frame(frame3);
//		Select select=new Select(driver.findElement(By.id("selectnav1")));
//		select.selectByVisibleText("-- Core Java");
//		Thread.sleep(30000);
//		
//		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frm1']"));
//		driver.switchTo().frame(frame1);
//		Select select1=new Select(driver.findElement(By.id("selectnav1")));
//		select.selectByVisibleText("-- Core Java");
//		Thread.sleep(30000);
//		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("name")).sendKeys("Gaurav");
//		Thread.sleep(30000);
//		
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("Ankit");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
