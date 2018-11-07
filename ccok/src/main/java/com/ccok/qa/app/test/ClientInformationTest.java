package com.ccok.qa.app.test;

import org.openqa.selenium.WebDriver;

import com.ccok.qa.app.pages.ClientInformationPage;

public class ClientInformationTest extends TestExecutor{
	
	
	public ClientInformationTest(WebDriver driver) {
       super(driver, prop);
    }
	
	public void setCagDetails() throws InterruptedException {
		
		ClientInformationPage clientInformationPage =new ClientInformationPage(driver);
		clientInformationPage.setCag(System.getProperty("career_Code"), System.getProperty("account_Code"), System.getProperty("group_Code"), System.getProperty("Cag_Type"), System.getProperty("override_Plan_Code"));
		
	}
	
	public void setSrxDetails() throws InterruptedException {
		
		ClientInformationPage clientInformationPage =new ClientInformationPage(driver);
		clientInformationPage.setSrcCopay(prop.getProperty("srxDaysApply"));
		
	}
	
	public void setAccumDetails() throws InterruptedException {
		
		ClientInformationPage clientInformationPage =new ClientInformationPage(driver);
		clientInformationPage.setAccum(System.getProperty("ded_Ind_Details"),System.getProperty("ded_Fam_Details"), System.getProperty("moop_Ind_Details"),System.getProperty("moop_Fam_Details"));
		
	}

}
