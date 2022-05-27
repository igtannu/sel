package com.Selenium_assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productsearch {
	
	WebDriver driver;
//	WebDriverWait wait=new WebDriverWait(driver, 20);

	public productsearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	public WebElement SearchBox;
	
	
	
	@FindBy(how=How.ID,using="nav-search-submit-button")
	public WebElement SearchButton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div")
	public WebElement product;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[9]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	public WebElement clickpro;
	@FindBy(how=How.CSS,using="input#buy-now-button")
	public WebElement BuyNowbutton;
	
	public void ClickSearchBox() {
		SearchBox.click();
	}
	
	public void enterproduct(String value) {
		SearchBox.sendKeys(value);
	}
	
	public void clicksearchbutton() {
		SearchButton.click();
	}
	public void chooseproduct() {
		product.click();
		clickpro.click();
	}
	
	public void clickbuynowbutton() {
	
		BuyNowbutton.click();
		}

}
