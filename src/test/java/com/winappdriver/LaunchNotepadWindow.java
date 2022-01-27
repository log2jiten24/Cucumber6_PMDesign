package com.winappdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;

public class LaunchNotepadWindow {

	public  WindowsDriver driver = null;

	@BeforeMethod
	public void setUp() {

		DesiredCapabilities capab = new DesiredCapabilities();
        //set the capabilities 
		capab.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		capab.setCapability("platformName", "Windows");
		capab.setCapability("deviceName", "WindowsPC");

		// add the Server URL
        try {
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capab);
        } catch (MalformedURLException e) {
        	
         e.printStackTrace();
		}
        // implicit wait 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void checkHelpButton() {

		driver.findElementByName("Help").click();
        driver.findElementByName("About Notepad").click();
		driver.findElementByName("OK").click();

	}
	
	
	@Test(priority = 2)
	public void enterText() {
		
		driver.findElementByName("Text Editor").sendKeys("Jiten my Notpepad Opening Automation" + 
		"\n This is my first automation ");
		driver.findElementByName("Text Editor").clear();
	}

	@Test(priority = 3 )
	public void EnterDateandTime() {
		
		driver.findElementByName("Edit").click();
	
		driver.findElementByAccessibilityId("26").click();
	    String value = driver.findElementByName("Text Editor").getAttribute("Value.Value");
	    System.out.println ("Value of time :" + value);
	    Assert.assertTrue(value.contains("12-09-2021"));
	    
	   // driver.findElementByAccessibilityId("CommandButton_7").click();
	   // driver.findElementByName("Cancel").click(); 
	}
	
	@AfterMethod
	public void cleanUp() {

		driver.quit();

	}

	
	
}
