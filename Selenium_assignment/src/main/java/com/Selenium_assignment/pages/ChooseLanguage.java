package com.Selenium_assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChooseLanguage {

	
	WebDriver driver;
	public ChooseLanguage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")
	public WebElement ClickChooseLanguage;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/span[1]")
	public WebElement ChooseHindiLanguage;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/span[1]")
	public WebElement ChooseEnglishLanguage;
	
	public void ClickonChooseLanguage() {
		Actions action=new Actions(driver);
		action.moveToElement(ClickChooseLanguage).perform();
		ChooseHindiLanguage.click();
	}
	
	public void AgainchooseEnglish() {
		Actions action=new Actions(driver);
		action.moveToElement(ClickChooseLanguage).perform();
		ChooseEnglishLanguage.click();
	}
	
}
