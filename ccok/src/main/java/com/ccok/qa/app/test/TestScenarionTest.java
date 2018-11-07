package com.ccok.qa.app.test;

import org.openqa.selenium.WebDriver;

import com.ccok.qa.app.pages.TestScenarioPage;

public class TestScenarionTest extends TestExecutor{
	
	public TestScenarionTest(WebDriver driver) {
	       super(driver, prop);
	    }
	
	public void setFormulary() throws InterruptedException {
		TestScenarioPage testScenarioPage = new TestScenarioPage(driver);
		testScenarioPage.setFormulary();
		
	}

	public void setFormularyID() {
		TestScenarioPage testScenarioPage = new TestScenarioPage(driver);
		testScenarioPage.setFormularyID(System.getProperty("My_Plan_Type"));
		
	}
	
	
}
