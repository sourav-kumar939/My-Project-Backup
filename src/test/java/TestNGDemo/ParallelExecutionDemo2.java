package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionDemo2 {
WebDriver driver;
	
	@Test(threadPoolSize = 4, invocationCount = 4 , invocationTimeOut = 1000)
	public void test4() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
//		Thread.sleep(5000);
		System.out.println("Test 4: "+Thread.currentThread().getId());
		//driver.close();
	}
	
	@Test
	public void test5() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(5000);
		System.out.println("Test 5 : "+Thread.currentThread().getId());
		//driver.close();
	}
	
	@Test
	public void test6() {
		System.out.println("Test 6 : "+Thread.currentThread().getId());
	}

}
