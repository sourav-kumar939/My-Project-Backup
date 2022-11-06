package TestNGDemo.CaptureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestNGDemo.Library.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Taking_screenshot_of_specific_UI_element {
	
	@Test
    public void specific_UI_element() throws Exception {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get( "http://omayo.blogspot.com/");
        
//        File srcScreenshot = driver.findElement(By.id("hbutton")).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(srcScreenshot, new File("./ScreenShots/img1.png"));
        
//         
        Utility.CaptureScreenshot(driver);
         
         WebElement element=driver.findElement(By.id("ta1"));
         //Utility.CaptureScreenshot(element);
         
        // driver.quit();
	}

}
