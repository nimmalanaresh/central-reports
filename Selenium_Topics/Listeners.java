package Selenium_Topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;
import com.web.utils.ExtentReporterNG;

public class Listeners implements ITestListener{
	WebDriver driver;
	ExtentTest test;

   ExtentReports extent  = ExtentReporterNG.getReporterObject();
	@Override
	public void onTestStart(ITestResult result) {

	  test =extent.createTest(result.getMethod().getMethodName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "test passed");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Naresh\\Eclipse-projects\\web\\screenshot.png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.fail(result.getThrowable());
		}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
			}

	@Override
	public void onStart(ITestContext context) {
		
			}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();
			}

}
