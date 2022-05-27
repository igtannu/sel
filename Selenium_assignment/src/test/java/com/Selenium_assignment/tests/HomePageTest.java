package com.Selenium_assignment.tests;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Selenium_assignment.pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class HomePageTest extends BaseTest{
	//Logger log=Logger.getLogger(HomePageTest.class);

  @Test (priority=0)
  public void testAmazonLogo() {	  
	  extentTest =extent.startTest("testAmazonLogo");

	 log.info("******************CLICK AMAZON LOGO*******************");
		HomePage home=new HomePage(driver);
		home.ClickAmazonLogo();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

	}
  
  
   
  @Test (priority=1)
  public void ClickNextSlide() {
		 log.info("******************CLICK NEXT SLIDE*******************");

	    extentTest =extent.startTest("ClickNextSlide");

		HomePage home=new HomePage(driver);
		home.clickNextSlide();
		home.clickNextSlide();
		home.clickNextSlide();
		home.clickNextSlide();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

		
	}
  
  @Test (priority=2)
  public void Dropdown() {
		 log.info("******************CLICK DROPDOWN*******************");

	    extentTest =extent.startTest("Dropdown");

	  HomePage home=new HomePage(driver);
	  home.clickSearchInDropdown();
	  home.clickChooseBook();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

  }
 
  @Test (priority=3)
  public void clickReturn() {
		 log.info("******************CLICK RETURN & ORDERS*******************");

	    extentTest =extent.startTest("clickReturn");

	  HomePage home=new HomePage(driver);
	  home.clickreturnorder();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

  }
  
  @Test(priority=4)
  public void chooseFashion() {
		 log.info("******************CLICK CHOOSE FASHION*******************");

	    extentTest =extent.startTest("chooseFashion");

	  HomePage home=new HomePage(driver);
	  home.clicknavbarFashion();
	  home.clickchoosekurtis();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

	  
	  
  }
  
}	
  

