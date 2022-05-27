package com.Selenium_assignment.tests;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import org.testng.annotations.Test;

import com.Selenium_assignment.pages.RegisterPage;
import com.relevantcodes.extentreports.LogStatus;

public class RegisterPageTest extends BaseTest{
	//Logger log=Logger.getLogger(RegisterPageTest.class);

  @Test (priority=5)
  public void CreateNewuser() {
	  log.info("******************NEW USER REGISTER*******************");

	   extentTest =extent.startTest("CreateNewuser");
	  RegisterPage register=new RegisterPage(driver);
	  register.clickSignInOption();
	  register.CreateNewUser();
	  register.Enterusername("tanu");
	  register.EnterMobileno("1234657765");
	  register.EnterPassword("QW123456");
	  register.ClickonContinue();
	  extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");
	  log.info("******************USER REGISTER SUCESSFULLY*******************");


  }
}
