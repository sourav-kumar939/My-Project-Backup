package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {
	
	@org.testng.annotations.Test
	public void Test()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement element=driver.findElement(By.id("multiselect1"));
		
		Select select=new Select(element);
		
		
		List<WebElement> get_options=select.getOptions();
		System.out.println(get_options.size());
		
		
		select.selectByIndex(1);
		WebElement first_selected=select.getFirstSelectedOption();
		System.out.println(first_selected.getText());
		
		select.selectByIndex(1);
		Thread.sleep(5000);
		select.selectByValue("Hyundaix");
		Thread.sleep(5000);
		select.deselectAll();
		Thread.sleep(5000);
		select.selectByIndex(1);
		Thread.sleep(5000);
		select.selectByValue("Hyundaix");
		Thread.sleep(5000);
		
		List<WebElement> select_all=select.getAllSelectedOptions();
		System.out.println(select_all.size());
		
		Thread.sleep(5000);
		select.deselectByIndex(1);
		Thread.sleep(5000);
		select.deselectByValue("Hyundaix");
		Thread.sleep(5000);
	
		
		
		
		
		
		
	}

}
