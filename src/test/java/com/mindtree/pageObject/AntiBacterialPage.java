package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exception.PageObjectException;
import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class AntiBacterialPage extends AppUI {

	public static void checkAntiBacterialText(WebDriver driver,Logger log,ExtentTest test) {
		try 
		{
			if(driver.findElement(antiBacterialText).getText().equalsIgnoreCase("Tide Antibacterial Fabric Spray"))
			   {
				   DriverFunctions.click(driver,siteLogo);
			       Log.testLoggerInfo(log, "The Desired text is present");
			       ExtentUtility.pass(test, "The Desired text is present");
			   }
			   else
				   throw new PageObjectException("Product with desired text not found in antiBacterial search page");	
		}
		catch(Exception e) 
		{
			Log.testLoggerError(log, "The Desired text could not be found");
			ExtentUtility.fail(test, driver, "The Desired text could not be found");	
		}
	}

}
