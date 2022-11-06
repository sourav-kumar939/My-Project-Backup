package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterizing {

	WebDriver driver;
	@Ignore
	@Parameters({"url","username","pwsd"})
	@Test 
	public void m1(String url,String username,String pwsd) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);      
		WebElement usrname=driver.findElement(By.id("txtUsername"));
		usrname.sendKeys(username);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(pwsd,Keys.ENTER);
		
//		@Parameters("browserName")
//		@BeforeTest
//		public void InitialiseBrowser(String browserName) {
//			switch (browserName.toLowerCase()) {
//			case "chrome":
//				WebDriverManager.chromedriver().setup();
//				driver = new ChromeDriver();
//				break;
//			case "edge":                               // Its important. In this way by only passing the name of the browser in xml file i can open which ever browser i want
//				WebDriverManager.edgedriver().setup();
//				driver = new EdgeDriver();
//				break;
//			case "firefox":
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
//				break;
//			default:
//				System.out.println("Browsername is invalid");
//				break;
//			}
//			driver.manage().window().maximize();
//		}
	}
}
