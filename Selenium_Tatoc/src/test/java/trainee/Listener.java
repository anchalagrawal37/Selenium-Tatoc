package trainee;

import org.testng.*;

public class Listener implements ITestListener, ISuiteListener, IInvokedMethodListener {

	public static void main(String[] args) {

	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		
	}

	public void onStart(ISuite suite) {
		Reporter.log("About to begin suite"+ suite);
	}

	public void onFinish(ISuite suite) {
		Reporter.log("Suite executed");
		
	}

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}
