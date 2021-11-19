package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class BirthDayGiftsPage extends AppUI{
	
	public static void clickBirthDayGiftUnder1000(WebDriver driver,Logger log,ExtentTest test) {
		try {
		DriverFunctions.click(driver, birthdayGifts1000);
		Log.testLoggerInfo(log, "The Desired choice is selected");
		ExtentUtility.pass(test, "The Desired choice is selected");
		}
		
		catch(Exception e) {
			Log.testLoggerDebug(log, "The Desired choice could not be selected as the result page is available under Homepage");
			ExtentUtility.fail(test, driver, "The Desired choice could not be selected as the result page is available under Homepage");
		}
	}

}
