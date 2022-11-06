package UploadAndDownload;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Demo2.class)
public class Demo extends Demo3{

	
	
  @BeforeTest
  public void m1() {
	 
	  openBrowser();
	  driver.get("https://demoqa.com/");
	  
	}
  
  @Test
  public void m2() {
	  WebElement element=driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView();", element);
	  element.click();
	}
  
  @Test
  public void m3() {
	  driver.findElement(By.xpath("//*[text()='Elemeeents']")).click();
  }
  
//  @Test
//  public void m4() {
//	  Assert.assertTrue(false);
//  }
  
  
}
