package Calander;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDate3 {
	
	WebDriver driver;
	
	@Test
	public void handle_date() throws InterruptedException {
		
		String month="September";
		String year="2022";
		String date="09";
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		Thread.sleep(6000);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Departure']")));   //Opening the Date Picker
		element.click();
		
		Thread.sleep(2000);
		
		while(true) {
			
			String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/div/div)[1]")).getText();
			String arr[]=text.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if(mon.equals(month) && yr.equals(year)) {
				break;
			}
			else {
				
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
		
		driver.findElement(By.xpath("//div[@aria-label='Thu Sep 08 2022']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
	}

}
