package com.ccok.qa.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInboxPage {
	WebDriver driver;
    public MyInboxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id="ContentPlaceHolder1_txtBPDName")
    WebElement searchBox;
    
    @FindBy(id="ContentPlaceHolder1_btnSearch123")
    WebElement searchButton;
    
    @FindBy(id="ContentPlaceHolder1_BCListView1_gvList_Edit_0")
    WebElement editLink;
    
    @FindBy(id="ContentPlaceHolder1_BCListView1_gvList_Complete_0")
    WebElement completeLink;
    
    @FindBy(id="ContentPlaceHolder1_BCListView1_gvList_Plan Design Name_0")
    WebElement planLink;
    
    
    public void setSearchBox(String planId) {
        if (searchBox.isDisplayed()) {
        	searchBox.clear();
        	searchBox.sendKeys(planId);
        }
    }
    
    public void clickSearchButton() throws InterruptedException {
        if (searchButton.isDisplayed()) {
        	searchButton.click();
        	Thread.sleep(2000);
        }
    }
    
    public void clickEditLink() throws InterruptedException {
        if (editLink.isDisplayed()) {
        	editLink.click();
        	Thread.sleep(4000);
        }
    }
    
    public void clickCompleteLink() throws InterruptedException {
        if (completeLink.isDisplayed()) {
        	completeLink.click();
        	Thread.sleep(4000);
        }
    }
    public void clickPlanLink() throws InterruptedException {
        if (planLink.isDisplayed()) {
        	planLink.click();
        	Thread.sleep(4000);
        }
    }
    

}
