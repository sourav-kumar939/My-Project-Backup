package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityOfTestNG2 {
	
	WebDriver driver;			

    // Method 1: Open Brower say Firefox			
    @Test		
    public void openBrowser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();				
    }		

    // Method 2: Launch Google.com			
    @Test		
    public void launchGoogle() {				
        driver.get("http://www.google.co.in");						
    }		
    
    // Method 3: Perform a search using "Facebook"			
    @Test			
    public void peformSeachAndClick1stLink() {				
        driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook"+Keys.ENTER);								
    }		

    // Method 4: Verify Google search page title.	
   
    @Test		
    public void FaceBookPageTitleVerification() throws Exception {				
       						
        Thread.sleep(3000);		
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
			
    }

}
