package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends AppUI {

	public static void powderClick(Logger log, WebDriver driver, ExtentTest test) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(shopProducts).perform();
			a.moveToElement(powder).click().build().perform();
			Log.testLoggerInfo(log, " Hovered on shopProduct and clicked on powder ");
			test.log(LogStatus.PASS, " Hovered on shopProduct and clicked on powder ");
		} 
		catch (Exception e) {
			Log.testLoggerError(log, e.toString());
			ExtentUtility.fail(test, driver, "powderClick");
		}
	}

	public static void enterSearchBox(Logger log, WebDriver driver, ExtentTest test,String searchText) {
		try {

			DriverFunctions.sendkeys(driver, searchBox, searchText);
			DriverFunctions.click(driver, findIcon);
			Log.testLoggerInfo(log, "The Values are accesed from the Cucumber feature file into SearchBox");
			ExtentUtility.pass(test, "The Values are accesed from the Cucumber feature file into SearchBox");
		}

		catch (Exception e) {
			Log.testLoggerError(log, "The Values could not be accesed from the Cucumber feature file");
			ExtentUtility.fail(test, driver, "The Values could not be accesed from the Cucumber feature file");
		}
	}

	public static void laundryLearn(WebDriver driver, Logger log, ExtentTest test) {
		try {
			
			DriverFunctions.click(driver, learnMore);
			Log.testLoggerInfo(log, "How to Laundry Page appears succesfully");
			ExtentUtility.pass(test, "How to Laundry Page appears succesfully");
		} catch (Exception e) {
			Log.testLoggerError(log, "Could not reach How to Laundry Page");
			ExtentUtility.fail(test, driver, "Could not reach How to Laundry Page");
		}
	}
}
