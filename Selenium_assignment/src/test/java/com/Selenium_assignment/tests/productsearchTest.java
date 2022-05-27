package com.Selenium_assignment.tests;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.Selenium_assignment.pages.productsearch;
import com.relevantcodes.extentreports.LogStatus;

public class productsearchTest extends BaseTest{
	//Logger log=Logger.getLogger(productsearchTest.class);

  @Test (priority=11)
  public void SearchProductiphone() {
	  log.info("******************SEARCH FOR IPHONE*******************");

	   extentTest =extent.startTest("SearchProductiphone");
	  productsearch search=new productsearch(driver);
	  search.ClickSearchBox();
	  search.enterproduct("iphone 13");
	  search.clicksearchbutton();
	  search.chooseproduct();
    
	  extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

  }
  
  @Test (priority=12)
  public void SearchProductfootball() {
	  log.info("******************SEARCH FOR FOOTBALL*******************");

	   extentTest =extent.startTest("SearchProductfootball");
	  productsearch search=new productsearch(driver);
	  search.ClickSearchBox();
	  search.enterproduct("football");
	  search.clicksearchbutton();
	  search.chooseproduct();
	  search.clickbuynowbutton();
	  log.fatal("!!!!!!!!!!!!!!!!! CAN'T BUY FOOTBALL !!!!!!!!!!!!!!!!!!!!!!");
	  extentTest.log(LogStatus.PASS, "Test case Passed sucessfully");

  }
  
  
}
