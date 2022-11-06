package TestNGDemo.ExecuteFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer{

	
	int count=0;
	int retry_limit=3;
	
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count < retry_limit) {
				count++;
				return true;
			}
		}
		
		return false;
	}

}
