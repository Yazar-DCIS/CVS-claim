package com.ccok.qa.app.test;




import org.openqa.selenium.WebDriver;

import com.ccok.qa.app.pages.LoginPage;


public class LoginTest extends TestExecutor{
	
	
	public LoginTest(WebDriver driver) {
       super(driver, prop);
    }

	
	public void setLoginDetails() throws InterruptedException {
	    				
		driver.manage().window().maximize();
		driver.get("https://10.118.62.189/BenefitServUI/Benefit%20Testing/TestScenarioGeneration.aspx?BPDID=2LjZd0ak%2fZ9x9R0QmWqFUA%3d%3d&PlanName=j5kIPb3A40M1HddF98nZAw%3d%3d");
		
		LoginPage loginpage= new LoginPage(driver);
		
		loginpage.clickmoreInfo();
		loginpage.clickgoToWebsite();
		loginpage.setUserID(System.getProperty("My_Bserv_Username"));
		loginpage.setUserPassword(System.getProperty("My_Bserv_Password"));
		loginpage.signIn();

	    }

}
