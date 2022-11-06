package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {
	
WebDriver driver;
	
	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		Actions action=new Actions(driver);
		
		WebElement iframe=driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(iframe);
		
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(draggable, drop).build().perform();
	}

}
