package kiteUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseNew;

public class Listener extends BaseNew implements ITestListener {
	BaseNew b=new BaseNew();
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case is pass and Pass TC is "+result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case is failed and Failed test case anme is "+result.getName(),true);
		String value = result.getName();
		try {
			b.captureScreenshot(value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
