package TestNGDemo.ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestNGDemo.Library.BaseClass;
import TestNGDemo.Library.Utility;

public class Listeners_demo2 extends BaseClass implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the test Failed: "+result.getName());
		ScreenShot(result.getMethod().getMethodName());
		
		
	}

	

	

	

}
