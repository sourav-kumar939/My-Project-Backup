package TestNGDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void TestFacebook() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes, Continue')]")).click();
		Thread.sleep(5000);
		
		//Title Assertion
		String actutal_title=driver.getTitle();
		String expected_title="Log in to Facebook";
		Assert.assertEquals(actutal_title, expected_title,"Title mismatched");
		
		//URL Assertion
		String actutal_url=driver.getCurrentUrl();
		String expected_url="https://www.facebook.com/45";              //Purposely i'm writing the wrong url to show how Hard Assertion works
		Assert.assertEquals(actutal_url, expected_url,"URL mismatched");
		
		//Text Assertion
		String actutal_text=driver.findElement(By.id("email")).getAttribute("value");   //If you want to get text out of the text box then use- getAttribute()
		String expected_text="";
		Assert.assertEquals(actutal_text, expected_text,"Username Text mismatched");
		
		//Border Assertion
		String actutal_border=driver.findElement(By.id("email")).getCssValue("border");
		String expected_border="1px solid rgb(240, 40, 73)";                  // visit this site to convert hex to rgb value :-https://www.webfx.com/web-design/hex-to-rgb/
		Assert.assertEquals(actutal_border, expected_border,"Username Border mismatched");
		
		//ErrorMessage Assertion
		String actualErrorMessage = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage,"Username ErrorMessage mismatched");
		
		
		driver.quit();
	}

}
