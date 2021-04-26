package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.Utils;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;

public class Logs implements ITestListener {
	protected static ExtentReports reports;
	public static ExtentTest test;
	String folder_name;
    DateFormat df;
    String file_name;
	private ExtentReports extent;
	Utility ut;
	AppiumDriver driver;

	public void captureScreenShots() throws IOException {
		 
		ut = new Utility();
		driver= ut.getAppiumInstance();
        folder_name="screenshot";
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Date format fot screenshot file name
        df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
        //create dir with given folder name
        new File(folder_name).mkdir();
        //Setting file name
        file_name=df.format(new Date())+".png";
      
        //coppy screenshot file into screenshot folder.
        FileUtils.copyFile(f, new File(folder_name + "//" + file_name));
    }

	public void OnTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
		test.log(LogStatus.PASS, result.getMethod().getMethodName());
		test.setStartedTime(getTime(result.getStartMillis()));
		test.setEndedTime(getTime(result.getEndMillis()));

		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("on start");
		reports = new ExtentReports("C:\\Users\\HP\\Eclipseworkspace\\KFC_REGRESSION_UpdatedUI\\Screenshot\\KFC Report"+ ".html", true);

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
		System.out.println("on test failure");
		test.log(LogStatus.FAIL, result.getMethod().getMethodName()+ "TestCase is Failed");					
		test.setStartedTime(getTime(result.getStartMillis()));
		test.setEndedTime(getTime(result.getEndMillis()));
			try {
				captureScreenShots();
			
				test.log(LogStatus.FAIL, "Failed screenshot" + test.addScreenCapture("C:\\Users\\HP\\Eclipseworkspace\\KFC_Regression_UpdatedUI\\screenshot\\" + file_name));
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test start");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + "Testcase is Started ");
			
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("on finish");
		reports.endTest(test);
		reports.flush();
	}

		private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
		}
	}
	

