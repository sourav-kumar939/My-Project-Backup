package com.practice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	WebDriver driver=null;
	
	@Parameters({"browser"})
	@Test(dependsOnMethods="")
	public void OpenBrowser(@Optional("chrome")String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("http://omayo.blogspot.com/");
			driver.get("https://www.geeksforgeeks.org/program-for-armstrong-numbers/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			WebElement element=driver.findElement(By.xpath("//div[@class='close-div']/span"));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			//wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			
			
			
//			WebElement element=driver.findElement(By.xpath("//button[text()='Dropdown']"));
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].scrollIntoView();", element);
//			element.click();
			
//			WebElement waitElement=driver.findElement(By.linkText("Facebook"));
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.elementToBeClickable(waitElement));
//			waitElement.click();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.browserstack.com/guide/cross-browser-testing-in-selenium");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.geeksforgeeks.org/program-for-armstrong-numbers/");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			ChromeOptions option=new ChromeOptions();
			
			
			
			
		}
		
	}
	
	@DataProvider(name="dataProvide")
	public String[][] m2() {
		
		String[][] data=null;
		try {
		File file=new File("");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfColumns=sheet.getRow(0).getLastCellNum();
		
		data=new String[noOfRows-1][noOfColumns];
		for(int i=0;i<noOfRows-1;i++) {
			for(int j=0;j<noOfColumns;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
				
			}
		}
		fis.close();
		workbook.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	
}
