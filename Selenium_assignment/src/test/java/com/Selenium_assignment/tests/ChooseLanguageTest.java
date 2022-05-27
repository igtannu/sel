package com.Selenium_assignment.tests;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Selenium_assignment.pages.ChooseLanguage;
import com.relevantcodes.extentreports.LogStatus;

public class ChooseLanguageTest extends BaseTest{
	//Logger log=Logger.getLogger(ChooseLanguageTest.class);

  @Test (priority=15)
  public void ChooseHindiLanguage() {
	    extentTest =extent.startTest("ChooseHindiLanguage");
		  log.warn("******************CHANGE LANGUAGE TO HINDI*******************");
	  ChooseLanguage lan=new ChooseLanguage(driver);
		lan.ClickonChooseLanguage();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

	}
  
  @Test (priority=16)
  public void ChooseEnglishLanguage() {
	    extentTest =extent.startTest("ChooseEnglishLanguage");

	  log.warn("******************CHANGE LANGUAGE TO ENGLISH*******************");

	  ChooseLanguage lan=new ChooseLanguage(driver);
		lan.AgainchooseEnglish();
	    extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

	}

}
