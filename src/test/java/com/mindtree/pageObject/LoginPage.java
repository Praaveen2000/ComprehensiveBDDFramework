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

public class LoginPage extends AppUI {

	public static void loginValid(Logger log, WebDriver driver, ExtentTest test,String Email,String pass) {
		try {
			    DriverFunctions.sendkeys(driver, eMail, Email);
			    DriverFunctions.sendkeys(driver, passWord, pass);
			    DriverFunctions.click(driver, SignInBtn);
				Log.testLoggerInfo(log, "Login Successful");
				test.log(LogStatus.PASS, "Login Successful");
			}
		
		catch (Exception e) {
			DriverFunctions.click(driver, siteLogo);
			Log.testLoggerError(log, "Login not Successful");
			Log.testLoggerWarn(log, "Robot PopUp appears at times");
			ExtentUtility.fail(test, driver, "Login not Successful");
		}
	}
	
	public static void clickForgot(Logger log, WebDriver driver, ExtentTest test) {
		try {
		        DriverFunctions.click(driver, forgotButton);	
				Log.testLoggerInfo(log, "Navigated to Reset password page");
				test.log(LogStatus.PASS, "Navigated to Reset password page");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Not navigated to Reset password page");
			ExtentUtility.fail(test, driver, "Not navigated to Reset password page");
		}
	}

}
