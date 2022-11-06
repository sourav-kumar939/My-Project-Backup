package BrokenLinks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.goibibo.com/flights/");
		driver.get("https://demoqa.com/broken");
		//driver.get("https://the-internet.herokuapp.com/broken_images");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void m1(){
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
		
//	for(int i=0;i<links.size();i++) {
//		System.out.println(links.get(i).getAttribute("href"));
//		System.out.println(links.get(i).getText());
//	}
	
	for(WebElement link:links) {
		System.out.println("Link Text:--"+link.getText());
		String url=link.getAttribute("href");
		System.out.println(url);
	}
  }
	
}
