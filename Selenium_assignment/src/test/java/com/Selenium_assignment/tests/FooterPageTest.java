package com.Selenium_assignment.tests;

import org.apache.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Selenium_assignment.pages.Footerpage;
import com.relevantcodes.extentreports.LogStatus;

public class FooterPageTest extends BaseTest {
	//Logger logger=Logger.getLogger(FooterPageTest.class);

  @Test(priority=13)
  public void clickhelp() {
	   extentTest =extent.startTest("clickhelp");
	  log.info("******************CLICK HELP*******************");
	  Footerpage footer=new Footerpage(driver);
	  footer.help();
	  extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");  
  }
  @Test (priority=14)
  public void clickfb() {
	  extentTest =extent.startTest("clickfb");
	  log.info("******************CLICK FB PAGE AMAZON*******************");
	  Footerpage footer=new Footerpage(driver);
	  footer.fbpagefun();
	  String URLFB=driver.getCurrentUrl();
	  Assert.assertEquals(URLFB, "https://www.facebook.com/AmazonIN");
	  extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");  
	  
  }
  
}
