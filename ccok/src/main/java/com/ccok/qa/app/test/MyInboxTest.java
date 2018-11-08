package com.ccok.qa.app.test;

import org.openqa.selenium.WebDriver;

import com.ccok.qa.app.pages.MyInboxPage;

public class MyInboxTest extends TestExecutor{
	
	public MyInboxTest(WebDriver driver) {
	       super(driver, prop);
	    }
	
	public void setInboxDetails(String linktype) throws InterruptedException {
		
		MyInboxPage myInboxPage =new MyInboxPage(driver);
		myInboxPage.setSearchBox(System.getProperty("My_Plan_ID"));
		myInboxPage.clickSearchButton();
		
		if(linktype.contains("Edit"))
		{
			myInboxPage.clickEditLink();
		}
		else if (linktype.contains("Complete"))
		{
			myInboxPage.clickCompleteLink();
		}
		else {
			myInboxPage.clickPlanLink();
		}
		
		
	}
	
	
}
