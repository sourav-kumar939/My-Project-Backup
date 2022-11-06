import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	WebDriver driver=null;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		
	}
	
	@Test
	public void m1() {
		
     List<WebElement> datas = driver.findElements(By.xpath("//div[@class='rt-table']/div[@class='rt-tbody']"));     
     
     for(WebElement data:datas) {
    	 
    	 String str=data.getText();
    	 System.out.println(str);
     }
	}
}
