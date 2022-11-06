package com.practice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
    
	WebDriver driver;
	
	@BeforeTest
	public void initializeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginDetails() {
		WebElement user=driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		WebElement pwd=driver.findElement(By.id("txtPassword"));
		pwd.sendKeys("admin123",Keys.ENTER);
	}
	
	@Test
	public void verifyLogin() {
		WebElement wlcm=driver.findElement(By.id("welcome"));
		boolean b=wlcm.getText().startsWith("Welcome");
		Assert.assertTrue(b);
	}
	
	@Test
	public void clickInfo() {
		WebElement info=driver.findElement(By.xpath("//div[@id='mainMenu']//b[text()='My Info']"));
		info.click();
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Date date=new Date();
		String time=date.toString().replace(":", "-");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D:/ScreenShot/"+time+".jpg"));
			System.out.println("Screenshot Captured");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Thread.sleep(3000);
		driver.close();
		ChromeOptions options=new ChromeOptions();
	}
	
}
