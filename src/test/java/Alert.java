import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//1: Simple Alert
		
		WebElement er=driver.findElement(By.id("alertBox"));
//		
//		
	    if((er.isDisplayed())& er.isEnabled()) {
		er.click();
	    }
//		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//2: Confirmation Alert
		
		WebElement confirmation=driver.findElement(By.id("confirmBox"));
//		
		if((confirmation.isDisplayed()) & confirmation.isEnabled()) {
			confirmation.click();
		}
//		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//3: Prompt Alert
		
		WebElement Element=driver.findElement(By.id("promptBox"));
		JavascriptExecutor js= (JavascriptExecutor)driver;          // This is done to Scroll the page-------Very Important
		js.executeScript("arguments[0].scrollIntoView();", Element);  // 1st way to scroll
		//js.executeScript("window.scrollBy(0,1000)");                //2nd way to scroll
		
         WebElement prompt=driver.findElement(By.id("promptBox"));
         Element.click();
         
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Saurav");
		System.out.println(driver.findElement(By.id("output")));
		
	}
	
	
	
	
//WebDriver driver;
//	
//	@BeforeMethod
//	public void openBrowser() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		//driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
//	}
//	
//	@Test
//	public void m1() throws InterruptedException {
//		
//		//-------------------------Simple Alert---------------------
//		
////        WebElement element=driver.findElement(By.id("alertBox"));
////        element.click();
////        Alert alert=driver.switchTo().alert();
////        
////        System.out.println(alert.getText());
////        
////        alert.accept();
////        driver.close();
//        
//        //------------------------Confirmation Alert-----------------------
//		
////		WebElement element1=driver.findElement(By.id("confirmBox"));
////        element1.click();
////        
////        Alert alert1=driver.switchTo().alert();
////        
////        System.out.println(alert1.getText());
////        alert1.dismiss();
////        driver.close();
//        
//        //--------------------Prompt Alert-----------------------
//        
////        WebElement element2=driver.findElement(By.id("promptBox"));
////        JavascriptExecutor js=(JavascriptExecutor)driver;
////        js.executeScript("arguments[0].scrollIntoView();", element2);
////        element2.click();
////        Thread.sleep(3000);
////        driver.switchTo().alert().sendKeys("Saurav");
////        driver.switchTo().alert().accept();
////        System.out.println(driver.findElement(By.id("output")));
////        driver.close();
//		
//		
//		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		driver.switchTo().frame(frame);
//		WebElement element2=driver.findElement(By.xpath("//button[text()='Try it']"));
//		element2.click();
//		driver.switchTo().alert().sendKeys("Saurav");
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("demo")).getText());
//		driver.switchTo().alert().
//	}

}
