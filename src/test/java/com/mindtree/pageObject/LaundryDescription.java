package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exception.PageObjectException;
import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExcelUtility;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class LaundryDescription extends AppUI{
	
	public static void checkLaundryText(WebDriver driver, Logger log, ExtentTest test) 
	{
		try 
		{
			if(driver.findElement(laundryText).getText().equalsIgnoreCase("How to Read Laundry Symbols"))
			   {
			       Log.testLoggerInfo(log, "The Desired text is present");
			       ExtentUtility.pass(test, "The Desired text is present");
			   }
			   else
				   throw new PageObjectException("Product with desired text not found in laundry search page");	
		}
		catch(Exception e) 
		{
			Log.testLoggerError(log, "The Desired text could not be found");
			ExtentUtility.fail(test, driver, "The Desired text could not be found");	
		}
	}

}
