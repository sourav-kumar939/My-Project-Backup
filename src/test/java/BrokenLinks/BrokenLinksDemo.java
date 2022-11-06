package BrokenLinks;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.deadlinkcity.com/");
		driver.get("https://demoqa.com/broken");
	}
	
	@Test
	public void m1() {
		
		int noOfBrokenLinks=0;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//links.addAll(driver.findElements(By.tagName("img")));
		
		Set<String> brokenlinkUrls = new HashSet<String>();
		
		
		for(WebElement link:links) {
			
			String url=link.getAttribute("href");
			//Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("hostname", 443));
			
			if(url==null || url.isEmpty()) {
				
				System.out.println("URL is Empty");
				continue;
			}
			
			HttpURLConnection huc;
			
			try {
				huc = (HttpURLConnection)new URL(url).openConnection();
				
				huc.connect();
				huc.setConnectTimeout(3000);
				int response=huc.getResponseCode();
				
                if(response>=400) 
                {
                	noOfBrokenLinks++;
                	brokenlinkUrls.add(url);
					//System.out.println(url+" Is broken");
					
				}
//                else {
//					
//					System.out.println(url+" Is a valid link");
//					
//				}
				
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		//System.out.println("No Of Broken Links:-"+noOfBrokenLinks);
		
		for(String brokenlinkUrl:brokenlinkUrls) {
			System.out.println(brokenlinkUrl);
			
		}
	}

}
