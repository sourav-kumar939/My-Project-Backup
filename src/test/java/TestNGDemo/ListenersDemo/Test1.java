package TestNGDemo.ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@Listeners(Listeners_demo.class)
public class Test1 {

	WebDriver driver;
	
	@Test//Success
	public void OpenBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test//Failed
	public void TitleMatch()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String original_title=driver.getTitle();
		String expected_title="Facebook – log in or sign";
		Assert.assertEquals(original_title,expected_title);
	}
	
	@Test
	public void SkipTest() {
		throw new SkipException("Skipping the Test Method");
	}
}
