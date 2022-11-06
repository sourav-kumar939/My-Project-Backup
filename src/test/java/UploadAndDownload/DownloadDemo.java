package UploadAndDownload;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadDemo {

	
	@Test
	public void dowload() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
//		String downloadPath=System.getProperty("user.dir");    // -----------------------if u wanna find the location of the current directory
		
		String downloadPath="C:\\Users\\saura\\eclipse-workspace\\SeleniumProject\\Download";
		
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("profile.default_content_settings.popups", 0);
		map.put("download.default_directory", downloadPath);
		 
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("prefs", map);
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		WebElement element=driver.findElement(By.linkText("Download"));
		element.click();
		
		Thread.sleep(3000);
		//sampleFile.jpeg
		
		String filePathUpdated="C:\\Users\\saura\\eclipse-workspace\\SeleniumProject\\Download\\sampleFile.jpeg";
		File file=new File(filePathUpdated);
		//Assert.assertTrue(file.exists());
		if(file.exists()) {
			System.out.println("File Downloaded Successfully");
		}
		else {
			System.out.println("File not Downloaded");
		}
		
		
	}
	
	
	
	
}
