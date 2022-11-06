package com.practice;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestNGDemo.Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExcel {
	
	WebDriver driver=null;

	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
	}
	
	@Test(dataProvider="loginDetails",dataProviderClass=DataProviderExcelSupplier.class)
    public void textBox(String fullName,String email,String currentAddress,String permanentAddress) {
		WebElement fullnm=driver.findElement(By.id("userName"));
		fullnm.sendKeys(fullName);
		WebElement eml=driver.findElement(By.id("userEmail"));
		eml.sendKeys(email);
		WebElement curntAdd=driver.findElement(By.id("currentAddress"));
		curntAdd.sendKeys(currentAddress);
		WebElement prmtAdd=driver.findElement(By.id("permanentAddress"));
		prmtAdd.sendKeys(permanentAddress);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('submit').click()");
		
		java.util.Date date = new java.util.Date();          //If Date class is showing any erroe on importing then use in this way
		String time=date.toString().replace(":", "-");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D:/ScreenShot/"+time+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ScreenShot Captured");
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		
//		try {
//			Utility.CaptureScreenshot(driver);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//driver.close();
	}
}
