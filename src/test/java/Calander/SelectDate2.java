package Calander;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDate2 {
	
    WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void m1() throws InterruptedException {
		
		WebElement element= driver.findElement(By.xpath("//span[text()='Departure']"));
		element.click();
		
		String month="November";
		String year="2022";
		
		while(true) {
			String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]")).getText();
			String[] arr=text.split(" ");
			String mnth=arr[0];
			String yr=arr[1];
			
			if(mnth.equals(month) && yr.equals(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("(//div[@class='DayPicker-NavBar']/span)[2]")).click();
			}
		}
		driver.findElement(By.xpath("//div[@class='DayPicker-Body']//div[@aria-label='Thu Nov 10 2022']/p")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
	}

}
