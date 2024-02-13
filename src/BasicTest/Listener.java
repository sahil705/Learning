package BasicTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//ITestListeners interface which implements testng listeners
public class Listener implements ITestListener
{

	@Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub   
    	//System.out.println("Congratulation your all test cases are pass");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub        
    	System.out.println("There are some issues in your test cases" + result.getTestName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub        
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub        
    }
	
}