package TestNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExecutionDemo {
WebDriver driver;
	
	@Test(threadPoolSize = 4, invocationCount = 4)
	public void test1() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.co.in/");
//		Thread.sleep(5000);
		System.out.println("Test 1: "+Thread.currentThread().getId());
		//driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(5000);
		System.out.println("Test 2 : "+Thread.currentThread().getId());
		//driver.close();
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3 : "+Thread.currentThread().getId());
	}

}
