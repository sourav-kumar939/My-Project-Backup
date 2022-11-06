package SelectClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValuesOfSelect {
	
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	}
	
	@Test
    public void m1() {
		WebElement element=driver.findElement(By.id("course"));
		
		Select select=new Select(element);
		
		List<WebElement>all=select.getOptions();
		for(int i=0;i<all.size();i++) {
			String s=all.get(i).getText();
			System.out.println(s);
		}
		
		Iterator<WebElement> itr=all.iterator();
		
		while(itr.hasNext()) {
			
			WebElement s1=itr.next();
			System.out.println(s1.getText());
		}
		
	}
}
