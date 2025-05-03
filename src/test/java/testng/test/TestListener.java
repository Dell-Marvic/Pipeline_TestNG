package testng.test;


import org.testng.*;

public class TestListener implements ITestListener 
{
    @Override
    public void onTestSuccess(ITestResult result) 
    {
        System.out.println("[SUCCESS] " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) 
    {
        System.out.println("[FAILURE] " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) 
    {
        System.out.println("[SKIPPED] " + result.getName());
    }

    @Override
    public void onStart(ITestContext context) 
    {
        System.out.println("[START] Suite : " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) 
    {
        System.out.println(" [FINISH] Suite : " + context.getName());
    }
}
