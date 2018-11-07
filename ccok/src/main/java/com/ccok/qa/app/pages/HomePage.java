package com.ccok.qa.app.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	
	WebDriver driver;
	
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
    
   
  
    @FindBy(css="div.globe > img")
    WebElement user;
	
	@FindBy(id="lstUserRoles")
    WebElement role;
	
	@FindBy(xpath="//ul[@id='menu']/li[2]")
    WebElement planDesign;
			
	@FindBy(xpath="//ul[@id='menu']/li[2]/ul/li[3]")
    WebElement autoUppload;
		
	@FindBy(id="liDynamicBRMD")
    WebElement dynamicBrmd;
	
	@FindBy(xpath="//ul[@id='menu']/li")
    WebElement collaboration;
	
	@FindBy(id="liInbox")
    WebElement inbox;
	
	
	 public void clickUser() {
        if (user.isDisplayed()) {
        	user.click();
        }
    }
	    
    public void selectRole(String userRole) throws InterruptedException {
        if (role.isDisplayed()) {
        	new Select(role).selectByVisibleText(userRole);
        	Thread.sleep(4000);
        }
    }
    
    public void selectplanDesign() {
    	
    	if (planDesign.isDisplayed()) {
    		Actions action = new Actions(driver);
    		action.moveToElement(planDesign).moveToElement(planDesign).click().build().perform();
    	
    	}
    	
    }
    
    public void selectAutoUpload() {
    	
    	if (autoUppload.isDisplayed()) {
    		Actions action = new Actions(driver);
    		action.moveToElement(autoUppload).moveToElement(autoUppload).click().build().perform();
    	}
    	
    }
    
    public void selectDynamicBrmd() throws InterruptedException {
    	
    	if (dynamicBrmd.isDisplayed()) {
    		Actions action = new Actions(driver);
    		action.moveToElement(dynamicBrmd).moveToElement(dynamicBrmd).click().build().perform();
    		Thread.sleep(4000);
    	}
    	
    }
    
    public void selectCollaboration() {
    	
    	if (collaboration.isDisplayed()) {
    		Actions action = new Actions(driver);
    		action.moveToElement(collaboration).moveToElement(collaboration).click().build().perform();
    	
    	}
    	
    }
    public void selectInbox() throws InterruptedException {
    	
    	if (inbox.isDisplayed()) {
    		Actions action = new Actions(driver);
    		action.moveToElement(inbox).moveToElement(inbox).click().build().perform();
    		Thread.sleep(4000);
    	
    	}
    	
    }

}
