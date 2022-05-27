# Amazon Website Automation Suite

#To run Amazon Automated Suite from command Line in the project Folder


## Packages Description

-com.Selenium_assignment.pages: Defining all the pages tests.

-com.Selenium_assignment.tests: Defining all utilities needed for Screenshot.

-com.Selenium_assignment.tests: Defining all the pages tests and asserts.

###Page.java and Test.java files description

***ChooseLanguage Page and Test :- Change language from English to Hindi and then vice-versa.

***Footer Page and Test :- Check for functions defined in footer.

***Home Page and Test :-  Check for  various functions like, logo , Dropdown list , NextSlide click, Return & orders, 
                          Navbar menu.
                          
***Login Page and Test :- All login testcases are test & defined here.

***ProductSearch Page and Test :- Search for product in search bar.

***Register Page and Test :- Test for Register new user.


###BaseTest:The main class 
- @BeforeSuite - to open browser, to setExtent,
- @AfterSuite - to end endReport, to close browser
- @BeforeTest - to open the extent report
- @BeforeMethod - to open the browser, to open url
- @AfterMethod - Attached the screenshot


###Other files description

- Screenshots.java: defines function to take screenshots


## Important Directory

- Drivers : ./Resources/drivers/
- Report File : ./Reports/ExtentReportGenerated.html
- Log File : application.log
- Configuration File: ./Resources/Config.properties
- Screenshots Folder: ./FailedTestsScreenshots/


## Main Parameters in Configuration.properties file
- global wait : to apply implicit wait
- URL : URL of Site
- Driver name : Name of browser
- Driver Address : Address of Driver



###Reports and Screenshots

- Extent report gets generated after the run under\src\test\Report\Report.html

- TestNG report as "emailable-report.html" gets generated under \test-output

- Screenshots gets placed under\Screenshots folder with test name and date and time

- Log File get placed under \application.log