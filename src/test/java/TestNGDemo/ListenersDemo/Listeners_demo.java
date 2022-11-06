package TestNGDemo.ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestNGDemo.Library.Utility;

public class Listeners_demo implements ITestListener{
	
	
	public void onStart(ITestContext context) {
		System.out.println("OnStart method invoked");
	}

	public void onFinish(ITestContext context) {
		System.out.println("OnFinish method invoked");
		
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Name of the test started: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the test Success: "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the test Failed: "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the test Skipped: "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	

}
