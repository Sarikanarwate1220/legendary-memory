package baseLayerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener extends TestcaseListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test case is started successfully" +result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case is running on browser" +result.getName());	
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failed" +result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("opps test case is skipped" +result.getName());
	}
	public void onStart(ITestContext context) 
	{
		System.out.println("test case onStart" +context.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("test case is finished" +context.getName());
	}
	}