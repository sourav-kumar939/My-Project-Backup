package UploadAndDownload;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestNGDemo.Library.BaseClass;

public class Demo2 extends Demo3 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Name of the test started: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the test Success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the test Failed: "+result.getName());
		screenShot(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the test Skipped: "+result.getName());
	}

	

	@Override
	public void onStart(ITestContext context) {
		System.out.println("OnStart method invoked");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("OnFinish method invoked");
	}

	
 
}
