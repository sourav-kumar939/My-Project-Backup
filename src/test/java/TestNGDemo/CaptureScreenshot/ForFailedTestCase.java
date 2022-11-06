package TestNGDemo.CaptureScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import TestNGDemo.Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ForFailedTestCase {
	
WebDriver driver;
	
	@Test//Success
	public void OpenBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test//Failed
	public void TitleMatch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String original_title=driver.getTitle();
		String expected_title="Facebook – log in or";
		Assert.assertEquals(original_title,expected_title);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			Utility.CaptureScreenshot_providingName(driver, result.getName());
		}
	}

}
