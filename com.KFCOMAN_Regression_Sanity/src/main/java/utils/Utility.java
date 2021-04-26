package utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Utility extends Logs {

	
	
	
	public static  AppiumDriver driver;
	String folder_name;
    DateFormat df;
     
	public static void LaunchApplication() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
				
		capabilities.setCapability("deviceName", "Galaxy A7");
		capabilities.setCapability("platformVersion", "8.0.0");
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.kfc.bahrain");
		capabilities.setCapability("appActivity", "com.americana.me.ui.onboarding.splash.SplashActivity");
		capabilities.setCapability("newCommandTimeout", 90 * 5);
		capabilities.setCapability("session-override",true);

		// Launch Appium
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	
public void click(WebElement locator) {
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		test.log(LogStatus.INFO, locator.toString() + "Element is clicked");
		}
		
		catch (Exception e) {
		test.log(LogStatus.FAIL, locator.toString() + "ELement is not clicked");
			// TODO: handle exception
			test.log(LogStatus.FAIL, e.getMessage());
			Assert.assertEquals(true, false);
		}
		
	}
	
		public void type(WebElement Locator, String value) {
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(Locator));
			Locator.sendKeys(value);
			test.log(LogStatus.INFO, Locator.toString() + value + "  Input done successfully");
	}
	
		public void gettext(WebElement locator) {
		//	try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
	        String text =	wait.until(ExpectedConditions.elementToBeClickable(locator)).getText();
			
			System.out.println(text);
			test.log(LogStatus.INFO, text.toString()+ " ++ Text is displayed");
			
		}	
		
		public void captureScreenShots() throws IOException {
	        folder_name="screenshot";
	        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //Date format fot screenshot file name
	        df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	        //create dir with given folder name
	        new File(folder_name).mkdir();
	        //Setting file name
	        String file_name=df.format(new Date())+".png";
	        //coppy screenshot file into screenshot folder.
	        FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
	    }


		public void swipeToBottom()
		{
			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			System.out.println("Height & width :" + height + " "+ width);
			int x = width/2;
			int top_y = (int)(height*0.10);
			int bottom_y = (int)(height*0.40);
			System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
			TouchAction ts = new TouchAction(driver);
			ts.press(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();
			}

		public void swipeToTop()
		{
			Dimension dim = driver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			System.out.println("Height & width :" + height + " "+ width);
			int x = width/2;
			int top_y = (int)(height*0.70);
			int bottom_y = (int)(height*0.30);
			System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
			TouchAction ts = new TouchAction(driver);
//			ts.press(PointOption.point(x, top_y)).moveTo(PointOption.point(x, bottom_y)).release().perform();
			ts.press(PointOption.point(x, bottom_y)).moveTo(PointOption.point(x, top_y)).release().perform();

			}
	
		public void back() throws InterruptedException {
			
			//	WebDriverWait wait = new WebDriverWait(driver, 3);
				Thread.sleep(2000);
				driver.navigate().back();
			}
			
	
		public AppiumDriver getAppiumInstance() {
			return driver;
			
		}	
}
