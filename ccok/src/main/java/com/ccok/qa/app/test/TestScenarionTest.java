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

	public void setFormularyID() throws InterruptedException {
		TestScenarioPage testScenarioPage = new TestScenarioPage(driver);
		testScenarioPage.setFormularyID(System.getProperty("My_Plan_Type"));
		
	}
	
	public void setScenarion() throws InterruptedException {
		TestScenarioPage testScenarioPage = new TestScenarioPage(driver);
		testScenarioPage.setScenarion();
		
	}
	
	public void setMember() throws InterruptedException {
		TestScenarioPage testScenarioPage = new TestScenarioPage(driver);
		testScenarioPage.setMember(prop.getProperty("memberState"), prop.getProperty("memberZipCode"));
		
	}
	
	public void getTestBed() throws InterruptedException {
		TestScenarioPage testScenarioPage = new TestScenarioPage(driver);
		testScenarioPage.setTestBed();
	}
	
	
	
}
