package selenium_Small_Concepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class _4_Listener_TestNG implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart - 1");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    
	  }

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart - 2");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
