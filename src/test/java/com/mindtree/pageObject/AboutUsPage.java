package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class AboutUsPage extends AppUI {
	public static void clickFacebook(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, faceBookBtn);
			    DriverFunctions.click(driver, siteLogo);
				Log.testLoggerInfo(log, "Navigated to Bigsmall Facebook page");
				ExtentUtility.pass(test, "Navigated to Bigsmall Facebook page");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Not navigated to Bigsmall Facebook page");
			ExtentUtility.fail(test, driver, "Not navigated to Bigsmall Facebook page");
		}
	}
}
