package com.ccok.qa.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class ClientInformationPage {

	WebDriver driver;
    public ClientInformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //cag details
    @FindBy(id="ucmenu_3")
    WebElement cagButton;
    
    @FindBy(id="ContentPlaceHolder1_gvAddGroupCode_txtAddCarrierCodefoot_0")
    WebElement careerCodeTextBox;
    
    @FindBy(id="ContentPlaceHolder1_gvAddGroupCode_txtAccountCodefoot_0")
    WebElement accountCodeTextBox;
    
    @FindBy(id="ContentPlaceHolder1_gvAddGroupCode_txtGroupCodefoot_0")
    WebElement groupCodeTextBox;
        
    @FindBy(id="ContentPlaceHolder1_gvAddGroupCode_ddlType_0")
    WebElement cagType;
    
    @FindBy(id="ContentPlaceHolder1_gvAddGroupCode_txtOverridePlancode_0")
    WebElement overrideplanTextBox;
   
  
   //Srx Copay details
    @FindBy(id="ucmenu_15")
    WebElement srxButton;
    
    @FindBy(id="ContentPlaceHolder1_GridMergedSteppedCopay_gvMerged_txtbx4_0")
    WebElement daysApplyTextbox;
    
    //accum details
    @FindBy(id="ucmenu_64")
    WebElement accumButton;
    
    @FindBy(id="ContentPlaceHolder1_gvInclusions_lblAmount_0")
    WebElement tire1_3_Ded;
    
    @FindBy(id="ContentPlaceHolder1_gvInclusions_lblAmount_1")
    WebElement tire4_5_Ded;
    
    @FindBy(linkText="Maximum Out Of Pocket")
    WebElement MoopButton;
    
    
    @FindBy(id="ContentPlaceHolder1_gvMOOPInclusions_lblAmount_0")
    WebElement tire1_3_Moop;
    
    @FindBy(id="ContentPlaceHolder1_gvMOOPInclusions_lblAmount_1")
    WebElement tire4_5_Moop;
    
    
    @FindBy(linkText="Maximum Allowable Benefits")
    WebElement mabButton;
    
    
    
    @FindBy(id="ContentPlaceHolder1_btnSaveNext")
    WebElement saveButton;
    
    @FindBy(id="ContentPlaceHolder1_btnsave")
    WebElement saveButtonSrx;
    
    @FindBy(id="ContentPlaceHolder1_Btn_DeductibleSave")
    WebElement saveButtonDed;
    
    @FindBy(id="ContentPlaceHolder1_Btn_MoopSave")
    WebElement saveButtonMoop;
    
    @FindBy(id="ContentPlaceHolder1_Btn_MabSave")
    WebElement saveButtonMab;
    
    @FindBy(id="ucmenu_btnFinalize")
    WebElement finalizeButton;
    
    @FindBy(id="ContentPlaceHolder1_btnProceed")
    WebElement finalizeProcessButton;
    
    
    
    public void setCag(String careerCode,String accountCode, String groupCode, String CagType,String overridePlanCode) throws InterruptedException {
		 if (cagButton.isDisplayed()) {
			 cagButton.click();
		 	Thread.sleep(4000);
		 }
		
		
		careerCodeTextBox.clear();
		careerCodeTextBox.sendKeys(careerCode);
		
		accountCodeTextBox.clear();
		accountCodeTextBox.sendKeys(accountCode);
		
		groupCodeTextBox.clear();
		groupCodeTextBox.sendKeys(groupCode);
		
		if(CagType!=null && CagType.contains("override") && overridePlanCode!=null){
			new Select(cagType).selectByVisibleText("Override");
			overrideplanTextBox.sendKeys(overridePlanCode);
			
		}
		saveButton.click();
    }
    
    public void setSrcCopay(String daysApply) throws InterruptedException {
    	
    	if (srxButton.isDisplayed()) {
    		srxButton.click();
		 	Thread.sleep(4000);
		 }
    	
    
    	if(daysApply.equals(daysApplyTextbox.getAttribute("value")))
    	{
    		System.out.println("SRX copay days apply is checked it is as per expected ----->");
    		saveButtonSrx.click();
    	}
    	else {
    		System.out.println("Stop Attention Required SRX copay days apply mismatch ----->");
    		System.exit(0);
    	}
    	
    }
    public void setAccum(String dedIndDetails,String dedFamDetails, String moopIndDetails,String moopFamDetails) throws InterruptedException {
    	
    	if (accumButton.isDisplayed()) {
    		accumButton.click();
		 	Thread.sleep(4000);

		 }
    	
   
    	
    	
    	if(tire1_3_Ded.getText().contains(dedIndDetails) && tire4_5_Ded.getText().contains(dedFamDetails))
    	{
    		System.out.println("DED for individual and family is checked and is as per expected ----->");
    		saveButtonDed.click();
    		Thread.sleep(4000);
    	}
    	else {
    		System.out.println("Stop Attention Required DED for individual and family mismatch ----->");
    		System.exit(0);
    	}
    	
    	MoopButton.click();
    	Thread.sleep(4000);
    	
    	
    	
    	if(tire1_3_Moop.getText().contains(moopIndDetails) && tire4_5_Moop.getText().contains(moopFamDetails))
    	{
    		System.out.println("Moop for individual and family is checked and is as per expected ----->");
    		saveButtonMoop.click();
    		Thread.sleep(4000);
    	}
    	else {
    		System.out.println("Stop Attention Required Moop for individual and family mismatch ----->");
    		System.exit(0);
    	}
    	
    	mabButton.click();
    	Thread.sleep(4000);
    	saveButtonMab.click();
    	Thread.sleep(4000);
    	finalizeButton.click();
    	Thread.sleep(4000);
    	finalizeProcessButton.click();
    	Thread.sleep(4000);
    }
    
    
}
