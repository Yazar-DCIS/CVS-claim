package com.ccok.qa.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    
    
    
    public void setFormulary() throws InterruptedException {
    	
    	if (formularyMapping.isDisplayed()) {
    		formularyMapping.click();

    	}
    }
    
    public void setFormularyID(String planType) {
    	
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
    }
    
    
}   
    	
    	
    	
