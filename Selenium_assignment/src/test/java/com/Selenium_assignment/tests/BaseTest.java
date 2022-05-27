package com.Selenium_assignment.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Selenium_assignment.utils.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BaseTest {
	
	static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	static File file=new File("./Resources/config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();  
	Logger log=Logger.getLogger(BaseTest.class);

	
static {
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			prop.load(fis);       
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
@BeforeSuite
public void setExtent() {
	extent =new ExtentReports("./Reports/ExtentReport.html");
}
//@BeforeMethod
//public void startTest() {
//	extent.endTest(extentTest);
//}
@AfterMethod
public void endTest() {
	extent.endTest(extentTest);
}
@AfterSuite
public void endReport() {
	extent.flush();
	extent.close();
}


//@Parameters("browserName")
@BeforeSuite
public  void initializeWebDriver()
{
	
	//System.out.println("browser is    "+browserName);
	//if(browserName.equalsIgnoreCase("chrome")) {
	  log.info("******************LAUNCH BROWSER*******************");
	System.setProperty(prop.getProperty("chromedriverProperty"),prop.getProperty("chromedriverPath"));
	ChromeOptions options=new ChromeOptions();
	 options.addArguments("window_size=1400,800");
	options.addArguments("Headless");
	 driver = new ChromeDriver(options);
	//For Headless mode uncomment the above 4 comments
//    driver=new ChromeDriver();
	
//	else if(browserName.equalsIgnoreCase("ie")) {
//		System.setProperty(prop.getProperty("iedriverProperty"),prop.getProperty("iedriverPath"));
//	    driver=new InternetExplorerDriver();
//	}
//	else {
//	      throw new IllegalArgumentException("Invalid browser value!!");
//	   }
//	
    String n=prop.getProperty("globalWait");
    driver.manage().timeouts().implicitlyWait( Long.parseLong(n),TimeUnit.SECONDS);


}

@AfterMethod 
public void attachScreenshot(ITestResult result) {
	
	  log.info("******************ATTACH FAILED SCCREENSHOTS*******************");

	
	if(result.getStatus()== ITestResult.FAILURE) {
		String scrPath = Screenshots.captureScreenshot(driver, result.getName());
		extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(scrPath) );
	}
}
@BeforeMethod
public void openurl() {
	  log.info("******************LAUNCH URL*******************");

	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();

}

@AfterSuite
public void closeBrowser() {
	  log.info("******************CLOSE BROWSER*******************");
	driver.quit();

}

	
}
	
	
	
 

