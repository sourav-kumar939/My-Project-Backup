package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {
	
    WebDriver driver;

	@BeforeTest
	public void setUp() {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		
	}
	
	@Test(dataProvider="loginData1" , dataProviderClass = ExcelDataSupplier2.class)
	public void signIn(String username, String password) {	

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	
		
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		
	}

	@AfterTest
	public void closeBrowser() {		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
//	WebDriver driver;
//
//	@BeforeTest
//	public void setUp() {		
//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");	
//		driver = new ChromeDriver();
//		driver.manage().window().setPosition(new Point(1000,0));
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://the-internet.herokuapp.com/login");		
//	}
//	
//	@Test(dataProvider="excel-data" , dataProviderClass = GetExcelData.class)
//	public void signIn(String username, String password) {				
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
//		String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();	
//		
//		Assert.assertEquals(msg.contains("is invalid!"), true);		
//	}
//
//	@AfterTest
//	public void closeBrowser() {		
//		driver.quit();
//	}
	
	
	
	
	
	
	
	
	
	
	
	

}
