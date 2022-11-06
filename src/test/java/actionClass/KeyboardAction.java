package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
	}
	
	@Test
	public void m1() throws InterruptedException {
		Actions actions=new Actions(driver);
		
		WebElement fullName=driver.findElement(By.id("userName"));
		fullName.sendKeys("Sourav Kumar");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("Saurav.kumar939@gmail.com");
		
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		
		
		//Selecting all the Current Address
		
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("a");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//		
//		//Copying all the Current Address
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("c");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
//		
//		//Going to the next Input box
//		actions.sendKeys(Keys.TAB);
//		actions.build().perform();
//		
//		//Paste the data of Current Address
//		
//		actions.keyDown(Keys.CONTROL);
//		actions.sendKeys("v");
//		actions.keyUp(Keys.CONTROL);
//		actions.build().perform();
		
		
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		actions.sendKeys(Keys.TAB).perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		Assert.assertEquals(currentAddress.getAttribute("value"), permanentAddress.getAttribute("value"));
		
		        //OR-----------------------------
		
		actions.sendKeys(currentAddress, "43 School Lane London EC71 9GO").keyDown(currentAddress, Keys.CONTROL).sendKeys(currentAddress, "a").keyUp(Keys.CONTROL).build().perform();
		actions.sendKeys(Keys.TAB).perform();
		
		
	}

}
