package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		//driver.get("https://demo.guru99.com/test/web-table-element.php");
	}
	
	@Test
	public void m1() throws InterruptedException {
		
//		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='countries']//tr"));
//		System.out.println(rows.size());
//	    Assert.assertEquals(rows.size(), 197);
//	    
//	    boolean result=false;
//		
//		for(WebElement row:rows) {
//			List<WebElement> cols=row.findElements(By.tagName("td"));
//			
//			String country=cols.get(1).getText();
//			String capital=cols.get(2).getText();
//			String currency=cols.get(3).getText();
//			String language=cols.get(4).getText();
////            System.out.println("Country:-"+country);
////            System.out.println("Capital:-"+capital);
////            System.out.println("Currency:-"+currency);
////            System.out.println("Language:-"+language);
//            
//            if(country.equals("Cambodia")) {
//            	result=true;
//            	Thread.sleep(3000);
//            	driver.findElement(By.xpath("//input[@class='hasVisited']")).click();
//            	
//            	break;
//            }
//       }
//		Assert.assertTrue(result);
//		//driver.quit();
		
		
		List<WebElement> tableDatas=driver.findElements(By.xpath("//table[@id='countries']//tr//td"));
		boolean result=false;
		
		for(WebElement tableData:tableDatas) {
			
			String value=tableData.getText();
			
			if(value.equals("Argentina")) {
				result=true;
				break;
			}
				
		}
		Assert.assertTrue(result);
		
		WebElement element=driver.findElement(By.xpath("//td//strong[text()='Argentina']//..//preceding-sibling::td//input"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td//strong[text()='Argentina']//..//preceding-sibling::td//input")));
		
		
		
		
		
		
	}

}
