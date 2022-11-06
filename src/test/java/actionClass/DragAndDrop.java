package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Actions actions=new Actions(driver);
		
		//WebElement drog_drop_source=driver.findElement(By.xpath("(//p[text()='I'm draggable but can't be dropped']//following::p)[1]"));
		driver.switchTo().frame(0);
		
		WebElement drag_source=driver.findElement(By.xpath("//span[text()='Lawrence Block']")); 
		
		
		WebElement drop_target=driver.findElement(By.xpath("//div[@id='treeTarget']/child::ul[@role='listbox']"));
		
		
		//actions.clickAndHold(drag_source).moveToElement(drop_target).release().build().perform();
		//actions.dragAndDrop(drag_source, drop_target).build().perform();
		
		
		
		
		
		
		
	}

}
