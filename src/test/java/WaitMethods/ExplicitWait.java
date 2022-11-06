package WaitMethods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	@org.testng.annotations.Test
	public void Test()throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		driver.findElement(By.xpath("//form[@autocomplete='on']/descendant::input[@type='text']")).sendKeys("8252243981");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("saurav943147486"+Keys.ENTER);       // New way to enter the key and hit Enter of keyboard
		
		//WebElement login_button=driver.findElement(By.xpath("//span[text()='Login']/ancestor::button"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;          
//		js.executeScript("arguments[0].click();", login_button);
		//login_button.click();
		Thread.sleep(3000);
		WebElement fashion=driver.findElement(By.xpath("//img[@alt='Fashion']"));
		
		actions.moveToElement(fashion).perform();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'Fashion')]/following::a[contains(text(),'Men Footwear')]")));
		WebElement men_footware=driver.findElement(By.xpath("//img[contains(@alt,'Fashion')]/following::a[contains(text(),'Men Footwear')]"));
		actions.moveToElement(men_footware).perform();
		
		WebElement men_sandle=driver.findElement(By.xpath("//span[text()='more in Men Footwear']/following::a[contains(text(),'Floaters')]"));
		actions.moveToElement(men_sandle).click().build().perform();
		
		
	}

}
