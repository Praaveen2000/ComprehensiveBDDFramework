package com.mindtree.pageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExcelUtility;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class ContactUsPage extends AppUI{
	public static void enterDetails(Logger log, WebDriver driver, ExtentTest test,String Name,String eMail,String contactMess) {
		try {
			    DriverFunctions.sendkeys(driver, contactName, Name);
			    DriverFunctions.sendkeys(driver, contactEmail, eMail);
			    DriverFunctions.sendkeys(driver, contactMsg, contactMess);
			    DriverFunctions.click(driver, contactSubmitBtn);
			    DriverFunctions.click(driver, siteLogo);
				Log.testLoggerInfo(log, "Entered contact details and notification shown");
				ExtentUtility.pass(test, "Entered contact details and notification shown");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Unable to enter Contact details");
			ExtentUtility.fail(test, driver, "Unable to enter Contact details");
		}
	}
}
