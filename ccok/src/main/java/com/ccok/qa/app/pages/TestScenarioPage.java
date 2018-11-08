package com.ccok.qa.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TestScenarioPage {
	
	WebDriver driver;
    public TestScenarioPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    @FindBy(linkText="Click Here")
    WebElement formularyMapping;
    
    @FindBy(id="ContentPlaceHolder1_BCListViewMain_gvList_Select_2")
    WebElement formularyMappingExchange;
    
    @FindBy(id="ContentPlaceHolder1_BCListViewMain_gvList_Select_7")
    WebElement formularyMappingCommercial;
    
    @FindBy(id="ContentPlaceHolder1_BCListViewMain_gvList_Select_5")
    WebElement formularyMappingGrandFather;
    
    @FindBy(id="ContentPlaceHolder1_btnAssociate")
    WebElement formularyAssociate;
    
    @FindBy(id="ContentPlaceHolder1_btnFirstRun")
    WebElement generateScenarioBtn;
    
    @FindBy(id="ContentPlaceHolder1_TabMember")
    WebElement membermappingButton;
    
    @FindBy(id="ContentPlaceHolder1_BtMemberRequest")
    WebElement initiateMembermappingButton;
    
    @FindBy(id="ContentPlaceHolder1_ddlState")
    WebElement memberState;
    
    @FindBy(id="ContentPlaceHolder1_TextZipcode")
    WebElement memberZipCode;
    
    @FindBy(id="ContentPlaceHolder1_okbutton")
    WebElement memberOkButton;
    
    @FindBy(id="ContentPlaceHolder1_BtMemberMapping")
    WebElement memberMap;
    
    
    @FindBy(id="ContentPlaceHolder1_TabScenario")
    WebElement scenarioTab;
    
    @FindBy(id="ContentPlaceHolder1_BtnExportToExcel")
    WebElement testBedButton;
    
    
    public void setFormulary() throws InterruptedException {
    	
    	if (formularyMapping.isDisplayed()) {
    		formularyMapping.click();

    	}
    }
    
    public void setFormularyID(String planType) throws InterruptedException {
    	
    	if(planType.equalsIgnoreCase("exchange")) {
    		formularyMappingExchange.click();
    	}
    	
    	else if(planType.equalsIgnoreCase("commercial")) {
    		formularyMappingCommercial.click();
    	}
    	else {
    		formularyMappingGrandFather.click();
    	}
    	
    	formularyAssociate.click();
    	Thread.sleep(4000);
    }
    
    public void setScenarion() throws InterruptedException {
    	Thread.sleep(2000);
    	generateScenarioBtn.click();
    	Thread.sleep(2000);
    }
    
    public void setMember(String state, String zipCode) throws InterruptedException {
    	
    	membermappingButton.click();
    	Thread.sleep(2000);
    	initiateMembermappingButton.click();
    	Thread.sleep(2000);
    	new Select(memberState).selectByVisibleText(state);
    	memberZipCode.sendKeys(zipCode);
    	memberOkButton.click();
    	Thread.sleep(2000);
    	memberMap.click();
    	Thread.sleep(2000);
    	
    }
    
    public void setTestBed() throws InterruptedException {
    	scenarioTab.click();
    	Thread.sleep(4000);
    	//testBedButton.click();
    	//Thread.sleep(2000);
    }
    
}   
    	
    	
    	
