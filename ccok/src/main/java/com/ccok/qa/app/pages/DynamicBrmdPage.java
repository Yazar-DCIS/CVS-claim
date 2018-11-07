package com.ccok.qa.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DynamicBrmdPage {
	
	WebDriver driver;
    public DynamicBrmdPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    

    @FindBy(id="ContentPlaceHolder1_ddlClient")
    WebElement clientname;
    
    @FindBy(id="ContentPlaceHolder1_ddlexcelType")
    WebElement excelFormat;
    
    @FindBy(id="ContentPlaceHolder1_ddlLOB")
    WebElement lob;
    
    @FindBy(id="ContentPlaceHolder1_FUBRMDDetails")
    WebElement filepath;
    
    @FindBy(id="ContentPlaceHolder1_btnUpldBRMD")
    WebElement uploadBtn;
    
    
    public void selectClientName(String client) {
        if (clientname.isDisplayed()) {
        	new Select(clientname).selectByVisibleText(client);
        }
    }
    
    public void selectExcelFormat(String excelType) {
        if (excelFormat.isDisplayed()) {
        	new Select(excelFormat).selectByVisibleText(excelType);
        }
    }
    
    public void selectLob(String lobType) {
        if (lob.isDisplayed()) {
        	new Select(lob).selectByVisibleText(lobType);
        }
    }
    
    public void selectFilePath(String fileLocation) {
        
        	filepath.sendKeys(fileLocation);
        
    }
    
    public void clickUploadBtn() {
        if (uploadBtn.isDisplayed()) {
        	uploadBtn.click();
        }
    }
    

}
