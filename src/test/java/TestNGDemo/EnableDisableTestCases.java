package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableDisableTestCases {
	
	WebDriver driver;
	
	
	

	@Parameters("url")
	@Test
	public void LaunchApp(String url) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Parameters({"username", "password"})
	@Test
	public void EnterLoginDetails(String username, String password)throws Exception {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}

	@Test
	public void VerifyMyInfo() {
		boolean actualValue = driver.findElement(By.id("employee-details")).isDisplayed();
		Assert.assertTrue(actualValue);
	}

	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		Assert.assertTrue(element.isDisplayed());
		Assert.assertTrue(element.getText().startsWith("Welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText().startsWith("Welcome"));
	}

}
