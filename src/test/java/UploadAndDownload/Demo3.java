package UploadAndDownload;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	
	public static WebDriver driver=null;
	
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	public void screenShot(String testmethodname) {
		  Date date=new Date();
		  String time =date.toString().replace(":", "-");
		  
		  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			  FileUtils.copyFile(src, new File("./ScreenShots/"+time+"-"+testmethodname+".png"));
			System.out.println("Screenshot Captured Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }

	
 
}
