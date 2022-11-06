package UploadAndDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDemo {

	WebDriver driver;
	
	@Test
	public void autoIt() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		WebElement element = driver.findElement(By.id("uploadFile"));

		Actions action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
		
		
		try {
			Runtime.getRuntime().exec("C:\\Users\\saura\\OneDrive\\Desktop\\AutoIt\\UploadScript.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
