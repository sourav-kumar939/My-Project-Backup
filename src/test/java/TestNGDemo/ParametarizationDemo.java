package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametarizationDemo {
	
	    @Parameters({"url","username","pwsd"})
		@Test
		public void flipkart(String url,String username,String pwsd) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
	    	WebDriver driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get(url);
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(pwsd);
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
	}

}
