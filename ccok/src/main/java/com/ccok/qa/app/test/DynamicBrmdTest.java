package com.ccok.qa.app.test;


import org.openqa.selenium.WebDriver;

import com.ccok.qa.app.pages.DynamicBrmdPage;

public class DynamicBrmdTest extends TestExecutor{
	
	public DynamicBrmdTest(WebDriver driver) {
	       super(driver, prop);
	}
	
	DynamicBrmdPage dynamicBrmdPage = new DynamicBrmdPage(driver);
	
	public void setBrmdPath() throws InterruptedException {
		dynamicBrmdPage.selectClientName(prop.getProperty("ClientName"));
		dynamicBrmdPage.selectExcelFormat(prop.getProperty("ExcelFormat"));
		dynamicBrmdPage.selectLob(prop.getProperty("Lob"));
		dynamicBrmdPage.selectFilePath(System.getProperty("My_BRMD_Path"));
		dynamicBrmdPage.clickUploadBtn();
		//dynamicBrmdPage.clickRefreshBtn();
	}
}
