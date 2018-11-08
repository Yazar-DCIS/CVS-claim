package com.ccok.qa.app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import com.ccok.qa.app.test.LoginTest;

public class TestExecutor {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static InputStream input = null;
	
	
	public TestExecutor(WebDriver driver, Properties prop) {
	       
	    }
	
	public static void main(String[] args) throws InterruptedException, IOException {
		

		input = new FileInputStream("data.properties");

		// load a properties file
		prop.load(input);
			
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		driver = new InternetExplorerDriver(capabilities);
		
		LoginTest loginpage=new LoginTest(driver);
		loginpage.setLoginDetails();
		
		
		HomeTest homeTest=new HomeTest(driver);
		
		if(System.getProperty("Test_To_Run").equalsIgnoreCase("upload brmd"))
		{
		homeTest.setUserRole(prop.getProperty("UserRoleBrmd"));
		homeTest.setUploadBrmd();
		
		DynamicBrmdTest dynamicBrmdTest=new DynamicBrmdTest(driver);
		dynamicBrmdTest.setBrmdPath();
		}
		
		else if(System.getProperty("Test_To_Run").equalsIgnoreCase("test bed generation"))
		{
		homeTest.setUserRole(prop.getProperty("UserRoleTestBed"));
		homeTest.setTestBedGeneration();
		
		MyInboxTest myInboxTest = new MyInboxTest(driver);
		myInboxTest.setInboxDetails("Edit");
		
		ClientInformationTest clientInformationTest = new ClientInformationTest(driver);
		clientInformationTest.setCagDetails();
		clientInformationTest.setSrxDetails();
		clientInformationTest.setAccumDetails();
		clientInformationTest.setFinalizePlan();
		
		
		
		myInboxTest.setInboxDetails("Plan");
		TestScenarionTest testScenarionTest = new TestScenarionTest(driver);
		testScenarionTest.setFormulary();
		
		String MainWindow=driver.getWindowHandle();		
		
		// To handle all new opened window.				
	    Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();		
				
		while(i1.hasNext())			
		{		
		    String ChildWindow=i1.next();		
		    		
		    if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		    {    		
		         
		    	// Switching to Child window
		    	driver.switchTo().window(ChildWindow);	                                                                                                           
				
		    	testScenarionTest.setFormularyID();
		    	driver.switchTo().alert().accept();
		    	// Closing the Child Window.
                driver.close();		
		    }		
		}		
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
		
		testScenarionTest.setScenarion();
		driver.switchTo().alert().accept();
		
		testScenarionTest.setMember();
		driver.switchTo().alert().accept();
		testScenarionTest.getTestBed();

		try
		{
		     Robot robot = new Robot();
		     driver.findElement(By.id("ContentPlaceHolder1_BtnExportToExcel")).sendKeys("&quot;&quot;");
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(4000);
		     
		     robot.setAutoDelay(250);
		     System.out.println("tab ----------->");
		     for(int i=0;i<=25;i++)
		     {
		    	 	
		    	 robot.keyPress(KeyEvent.VK_TAB);
		     }
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     System.out.println("enter ----------->");
		     //driver.close();
		}
		catch (AWTException e)
		{
		    e.printStackTrace();
		}
		
		}
		
	}

}
