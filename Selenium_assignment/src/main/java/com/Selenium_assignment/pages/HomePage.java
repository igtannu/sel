package com.Selenium_assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, using="nav-logo-sprites")
	public WebElement AmazonLogo;
	
	@FindBy(how=How.CLASS_NAME,using="a-carousel-goto-nextpage")
	public WebElement NextSlide;
	
	 @FindBy(how=How.XPATH,using="//*[@id=\"searchDropdownBox\"]")
	 public WebElement SearchInDropdown;

	 @FindBy(how=How.XPATH,using="//*[@id=\"searchDropdownBox\"]/option[11]")
	 public WebElement ChooseBook;
	 
	 @FindBy(how=How.ID,using="nav-orders")
	 public WebElement Returnorder;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"nav-xshop\"]/a[6]")
	 public WebElement navbarFashion;
	
		//WebDriverWait wait=new WebDriverWait(driver,5);
	 @FindBy(how=How.XPATH,using="//*[@id=\"contentGrid_214512\"]/div/div[2]/div[4]/div/div/a/img")
	 public WebElement ChooseKurtis;
	 
	 

	 
	public void ClickAmazonLogo() {
		AmazonLogo.click();
	}

	
	
	public void clickNextSlide() {
		NextSlide.click();
	}
	
	public void clickSearchInDropdown() {
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	   //WebElement element = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy("Dropdown")));
		SearchInDropdown.click();
	}
	
	public void clickChooseBook() {
		ChooseBook.click();
	}
	
	public void clickreturnorder() {
		Returnorder.click();
	}
	
	public void clicknavbarFashion() {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		navbarFashion.click();
		//WebElement Element=driver.findElement((By) navbarFashion);
		navbarFashion.click();
		//js.executeScript("arguments[0].scrollIntoView();", navbarFashion);
		
	}
	
	public void clickchoosekurtis() {
		ChooseKurtis.click();
	}
	
	

}

