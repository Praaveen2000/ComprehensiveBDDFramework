package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExcelUtility;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class ProductDescriptionPage extends AppUI {
	
	public static void addToWishList(WebDriver driver,Logger log,ExtentTest test) {
		try {
		DriverFunctions.click(driver, wishListBtn);
		DriverFunctions.click(driver, siteLogo);
		Thread.sleep(2000);
		Log.testLoggerInfo(log, "The Desired product is added to wishlist");
		ExtentUtility.pass(test, "The Desired product is added to wishlist");
		}
		
		catch(Exception e) {
			Log.testLoggerError(log, "The Desired product could not be added to wishlist");
			ExtentUtility.fail(test, driver, "The Desired product could not be added to wishlist");
		}
	}
	
	public static void addToCart(WebDriver driver,Logger log,ExtentTest test) {
		try {
		DriverFunctions.click(driver, addToCart);
		DriverFunctions.click(driver, closeCart);
		DriverFunctions.click(driver, siteLogo);
		Log.testLoggerInfo(log, "The Desired product is added to cart");
		ExtentUtility.pass(test, "The Desired product is added to cart");
		}
		
		catch(Exception e) {
			Log.testLoggerError(log, "The Desired product could not be added to cart");
			ExtentUtility.fail(test, driver, "The Desired product could not be added to cart");
		}
	}
	
	public static void checkCode(WebDriver driver,Logger log,ExtentTest test,String PIN) {
		try {
		DriverFunctions.sendkeys(driver, codeCheckBox, PIN);
		DriverFunctions.click(driver, codeCheckBtn);
		Thread.sleep(2000);
		DriverFunctions.click(driver, siteLogo);
		Log.testLoggerInfo(log, "The Desired product is checked for delivery");
		ExtentUtility.pass(test, "The Desired product is checked for delivery");
		}
		
		catch(Exception e) {
			Log.testLoggerError(log, "The Desired product could not be checked for delivery");
			ExtentUtility.fail(test, driver, "The Desired product could not be checked for delivery");
		}
	}

}
