package WebDriverMethods.NavigationMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://omayo.blogspot.com/");
	}
	
	@Test
	public void m1() throws InterruptedException {
		//driver.navigate().to("https://www.facebook.com/login/");
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
	}

}
