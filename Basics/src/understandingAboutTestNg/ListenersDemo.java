package understandingAboutTestNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " Test started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " Test case is executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println(result.getName() + " Test case is failed");
	}

}
