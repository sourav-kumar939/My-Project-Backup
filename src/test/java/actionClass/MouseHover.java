package actionClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	@org.testng.annotations.Test
	public void Test() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		
		WebElement element1=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		WebElement element2=driver.findElement(By.xpath("//a[text()='TestNG']"));
		
		actions.moveToElement(element1).moveToElement(element2).click().perform();
		
		
		
		//actions.moveToElement(element2).click();

}
	
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	}
	
	@Test
	public void m1() throws InterruptedException {
		
		Actions action=new Actions(driver);
		
		//--------------------Double Click-------------------
		
//		WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		action.moveToElement(doubleClick).doubleClick().build().perform();
		
		//------------------Right Click----------------------
		
//		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
//		action.moveToElement(rightClick).contextClick().build().perform();
		
		//----------------Mouse Hover-------------------------
		
		
		
		String parent=driver.getWindowHandle();
		
		WebElement mouseHover=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		action.moveToElement(mouseHover).perform();
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		
		Set<String> childs=driver.getWindowHandles();
		
		for(String child:childs) {
			String title=driver.switchTo().window(child).getTitle();
			System.out.println(title);
			if(title.equals("Selenium Webdriver Tutorial - Selenium Tutorial for Beginners")) {
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		
		WebElement mouseHover1=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		action.moveToElement(mouseHover1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='TestNG']")).click();
		driver.navigate().back();
		
		
	}
}
