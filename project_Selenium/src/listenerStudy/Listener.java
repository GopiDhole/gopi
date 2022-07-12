package listenerStudy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log("TC Start Successfull.....",true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC Execution successfull",true);
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC fail....",true);
		Reporter.log("Failed TC name is-"+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("TC skipped",true);
	}
	
	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("TC Finish...",true);
	}
}
