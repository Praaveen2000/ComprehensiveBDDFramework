package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class SearchResultsPage extends AppUI {
	
	public static void pickMat(WebDriver driver,Logger log,ExtentTest test) {
		try {
		DriverFunctions.click(driver, playMatProduct);
		Log.testLoggerInfo(log, "The Desired product is selected");
		ExtentUtility.pass(test, "The Desired product is selected");
		}
		
		catch(Exception e) {
			Log.testLoggerError(log, "The Desired product could not be selected");
			ExtentUtility.fail(test, driver, "The Desired product could not be selected");
		}
	}
	
	public static void pickAdiyogi(WebDriver driver,Logger log,ExtentTest test) {
		try {
		DriverFunctions.click(driver, adiyogiGift);
		Log.testLoggerInfo(log, "The Desired product is selected");
		ExtentUtility.pass(test, "The Desired product is selected");
		}
		
		catch(Exception e) {
			Log.testLoggerError(log, "The Desired product could not be selected");
			ExtentUtility.fail(test, driver, "The Desired product could not be selected");
		}
	}
	
	public static void pickBottle(WebDriver driver,Logger log,ExtentTest test) {
		try {
		DriverFunctions.click(driver, supermanBottle);
		Log.testLoggerInfo(log, "The Desired product is selected");
		ExtentUtility.pass(test, "The Desired product is selected");
		}
		
		catch(Exception e) {
			Log.testLoggerError(log, "The Desired product could not be selected");
			ExtentUtility.fail(test, driver, "The Desired product could not be selected");
		}
	}
}
