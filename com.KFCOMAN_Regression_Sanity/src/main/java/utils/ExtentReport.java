package utils;


import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.TakesScreenshot;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.model.Log;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReport implements IReporter {
private ExtentReports extent;
protected static ExtentReports reports;
public static ExtentTest test;


public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
String outputDirectory) {
	
extent = new ExtentReports("C:\\Users\\HP\\Eclipseworkspace\\KFC_REGRESSION_UpdatedUI\\Screenshot"+ "KFCReport.html", true);


for (ISuite suite : suites) {
Map<String, ISuiteResult> result = suite.getResults();

for (ISuiteResult r : result.values()) {
ITestContext context = r.getTestContext();

buildTestNodes(context.getPassedTests(), LogStatus.PASS);
buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
}
}

extent.flush();
extent.close();
}
public void OnTestStart(ITestResult result) {
	
	System.out.println("on test start");
	test = reports.startTest(result.getMethod().getMethodName());
	test.log(LogStatus.INFO, result.getMethod().getMethodName() + "Testcase is Started ");
	
}

public void onTestSuccess(ITestResult result) {
	System.out.println("on test success");
	test.log(LogStatus.PASS, result.getMethod().getMethodName()+ "TestCase is Passed");
}

public void OnTestFailure(ITestResult result) {
	System.out.println("on test failure");
	test.log(LogStatus.FAIL, result.getMethod().getMethodName()+ "TestCase is Failed");
	
}

private void buildTestNodes(IResultMap tests, LogStatus status) {
ExtentTest test;



if (tests.size() > 0) {
for (ITestResult result : tests.getAllResults()) {
test = extent.startTest(result.getMethod().getMethodName());
System.out.println("Report generated");



test.setStartedTime(getTime(result.getStartMillis()));
test.setEndedTime(getTime(result.getEndMillis()));

for (String group : result.getMethod().getGroups())
test.assignCategory(group);

if (result.getThrowable() != null) {
test.log(status, result.getThrowable());
} else {
test.log(status, "Test " + status.toString().toLowerCase()
+ "ed");
}

extent.endTest(test);
   }

  }

}


private Date getTime(long millis) {
Calendar calendar = Calendar.getInstance();
calendar.setTimeInMillis(millis);
return calendar.getTime();
}
}

