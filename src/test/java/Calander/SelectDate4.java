package Calander;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDate4 {
	
	static WebDriver driver;
	
	@Test
	public void handle_date() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Departure']")));   //Opening the Date Picker
		//WebElement element= driver.findElement(By.id("datepicker"));
//		String dateVal="11/16/2022";
//		datepickerJs(driver, dateVal, element);
		
		
		
		WebElement element=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(element);
		datepickerJs();
		
	}
	
	
	public void datepickerJs() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('datepicker').value='11/11/2022'");
		//document.getElementById('datepicker')
		
	}
	
	
	
//	public static void datepickerJs(WebDriver driver , String dateVal , WebElement element) {
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
//		
//	}

}
