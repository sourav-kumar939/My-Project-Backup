package TestNGDemo.CaptureScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestNGDemo.Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {
	
    WebDriver driver;
	
	@Test
	public void openbrowser() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123",Keys.ENTER);
		String actual_title=driver.getTitle();
		String expected_title="OrangeHRM";
		Assert.assertEquals(actual_title, expected_title);
		Utility.CaptureScreenshot(driver);
		 
		
		
		driver.close();
		
	}
	

}
