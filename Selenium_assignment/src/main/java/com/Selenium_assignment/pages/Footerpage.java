package com.Selenium_assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Footerpage {
	WebDriver driver;
	public Footerpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[7]/a")
	public WebElement help;
	
	@FindBy(how=How.LINK_TEXT,using="Facebook")
	public WebElement fbpage;
	
	
	public void help() {
		help.click();
	}
	
	public void fbpagefun() {
		fbpage.click();
	}
	
}
