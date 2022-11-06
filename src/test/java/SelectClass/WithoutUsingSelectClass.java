package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutUsingSelectClass {
	
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	}
	
	@Test
	public void m1() throws InterruptedException {
		
        List<WebElement> element=driver.findElements(By.xpath("//select[@id='course']//option"));
		
		for(int i=0;i<element.size();i++) {
			
            System.out.println(element.get(i).getText());
			
			if(element.get(i).getText().equals("Java")) {
				
				element.get(i).click();
				break;
			}
		}
		
		//---------------------------OR----------------------------   
		
        for(WebElement el:element) {
        	if(el.getText().equals("Java")) {
        		el.click();
        		break;
        	}
        }
		
	}

}
