package TestNGDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	public void TestGoogle() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String expectedTitle = "HYR Tutorials - Google Search";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title is matched");
//		String expectedTitle = "HYR Tutorials - Google Search";
//		String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		Thread.sleep(5000);
		driver.quit();
	}

	//@Test
//	public void TestFacebook() throws Exception {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
//		System.out.println(driver.getTitle());
//		Thread.sleep(5000);
//		driver.quit();
//	}

}
