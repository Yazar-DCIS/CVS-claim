package com.ccok.qa.app.test;



import org.openqa.selenium.WebDriver;

import com.ccok.qa.app.pages.HomePage;


public class HomeTest extends TestExecutor{
	
	public HomeTest(WebDriver driver) {
	       super(driver, prop);
	}
	HomePage homePage = new HomePage(driver);
	
	public void setUserRole(String role) throws InterruptedException {
		homePage.clickUser();
		homePage.selectRole(role);
		
	
	}
	
	
	public void setUploadBrmd() throws InterruptedException {
		homePage.selectplanDesign();
		homePage.selectAutoUpload();
		homePage.selectDynamicBrmd();
	}
	
	public void setTestBedGeneration() throws InterruptedException {
		homePage.selectCollaboration();
		homePage.selectInbox();
	}
	
	

}
