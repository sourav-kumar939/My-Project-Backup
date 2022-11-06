import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy2 {
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].setAttribute('value','"+date+"');",element);
	
	@Test(priority=1)
	public void a_method() {
		System.out.println("a_method");
	}
	@Test(priority=2)
	public void b_method() {
		System.out.println("b_method");
	}
	@Test(priority=3)
	public void c_method() {
		System.out.println("c_method");
	}
	@Test(priority=-1)
	public void d_method() {
		System.out.println("d_method");
	}
	@Test(priority=-2)
	public void e_method() {
		System.out.println("e_method");
	}
	
	   
}

