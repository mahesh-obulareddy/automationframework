package ttt.bootcamp.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Starting with testcase:: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TestExecuted Successfully:: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestExecution FAILED:: " + result.getName());
	}

}
