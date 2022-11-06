package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderD {
	
	WebDriver driver=null;
	
	@Test(dataProvider = "saurav")
	public void m1(String country,String place) throws Exception{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys(country+" "+place,Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name = "saurav")
	public String[][] m2() {
		String[][] s=new String[3][2];
		s[0][0]= "India";
		s[0][1]= "Qutub Minar";
		
		s[1][0]= "Agra";
		s[1][1]= "Taj Mahal";
		
		s[2][0]= "Hydrabad";
		s[2][1]= "Charminar";
		
		return s;
	}

}
