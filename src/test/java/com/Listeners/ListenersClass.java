package com.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failure");
	}
}
