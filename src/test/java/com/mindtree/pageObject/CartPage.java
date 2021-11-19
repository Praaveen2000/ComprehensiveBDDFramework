package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class CartPage extends AppUI {
	public static void clickRemove(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, removeBtn);
			    DriverFunctions.click(driver, closeCart);
			    DriverFunctions.click(driver, siteLogo);
				Log.testLoggerInfo(log, "Item successfully removed from cart");
				ExtentUtility.pass(test, "Item successfully removed from cart");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Item not removed from cart");
			ExtentUtility.fail(test, driver, "Item not removed from cart");
		}
	}
	
	public static void clickCheckout(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, checkoutBtn);
			    DriverFunctions.click(driver, closePopUp);
			    DriverFunctions.click(driver, returnToCart);
			    DriverFunctions.click(driver, siteLogo);
				Log.testLoggerInfo(log, "Navigated to Checkout and returned to HomePage");
				ExtentUtility.pass(test, "Navigated to Checkout and returned to HomePage");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Unable to checkout");
			ExtentUtility.fail(test, driver, "Unable to checkout");
		}
	}
	
}
