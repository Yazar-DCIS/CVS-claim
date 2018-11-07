package com.ccok.qa.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    
	WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(linkText="More information")
    WebElement moreInfo;
	
	@FindBy(id="overridelink")
    WebElement goIn;

	@FindBy(id="lgnLoginUser_UserName")
    WebElement userName;

    @FindBy(id="lgnLoginUser_Password")
    WebElement password;

    @FindBy(id="lgnLoginUser_LoginButton")
    WebElement loginButton;

	
    
    public void clickmoreInfo() {
        if (moreInfo.isDisplayed()) {
        	moreInfo.click();
        }
    }
    
    public void clickgoToWebsite() throws InterruptedException {
        if (goIn.isDisplayed()) {
        	goIn.click();
        	Thread.sleep(2000);
        }
    }

    public void setUserID(String userId) {
        if (userName.isDisplayed()) {
        	userName.clear();
        	userName.sendKeys(userId);
        }
    }
    
    public void setUserPassword(String userPassword) {
        if (password.isDisplayed()) {
        	password.clear();
        	password.sendKeys(userPassword);
        }
   }
        
        
    public void signIn() throws InterruptedException {
        if (loginButton.isDisplayed()) {
        	loginButton.click();
        	Thread.sleep(2000);
        }
     }   
        
   }
