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
import com.relevantcodes.extentreports.LogStatus;

public class ResetPasswordPage extends AppUI {
	public static void forgotPassword(Logger log, WebDriver driver, ExtentTest test,String rEmail) throws InterruptedException {
		try {	
			    DriverFunctions.sendkeys(driver, recoverEmail, rEmail);
			    DriverFunctions.click(driver,submitBtn);
			    Thread.sleep(2000);
			    DriverFunctions.click(driver, returnLoginBtn);
			    DriverFunctions.click(driver, siteLogo);
			    Log.testLoggerWarn(log, "Too many attempts page opens sometimes!!!");
				Log.testLoggerInfo(log, "Navigated back to login page and notification is shown");
				test.log(LogStatus.PASS, "Navigated back to login page and notification is shown");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Invalid Email! Could not retrive password");
			ExtentUtility.fail(test, driver, "Invalid Email! Could not retrive password");
		}
	}
}
