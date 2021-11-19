package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class WishListPage extends AppUI {
	public static void clickRemove(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, accessWishList);
			    DriverFunctions.click(driver, removeWishList);
				Log.testLoggerInfo(log, "Item successfully removed from wishlist");
				ExtentUtility.pass(test, "Item successfully removed from wishlist");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Item not removed from wishlist");
			ExtentUtility.fail(test, driver, "Item not removed from wishlist");
		}
	}
}
