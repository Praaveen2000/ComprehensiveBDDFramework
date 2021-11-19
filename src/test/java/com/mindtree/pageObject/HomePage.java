package com.mindtree.pageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.reusableComponents.DriverFunctions;
import com.mindtree.uistore.AppUI;
import com.mindtree.utility.ExcelUtility;
import com.mindtree.utility.ExtentUtility;
import com.mindtree.utility.Log;
import com.relevantcodes.extentreports.ExtentTest;

public class HomePage extends AppUI {

	public static void clickSignIn(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, signIn);
				Log.testLoggerInfo(log, "Navigated to the Login Page");
				ExtentUtility.pass(test, "Navigated to the Login Page");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Not navigated to the Login Page");
			ExtentUtility.fail(test, driver, "Not navigated to the Login Page");
		}
	}
	
	public static void giftSearch(Logger log, WebDriver driver, ExtentTest test,String searchText) {
		try {

			DriverFunctions.sendkeys(driver, searchBox, searchText);
			DriverFunctions.sendkeys(driver, searchBox, Keys.ENTER);
			Log.testLoggerInfo(log, "The Values are accesed from the Excel sheet into SearchBox and navigated to SearchResults page");
			ExtentUtility.pass(test, "The Values are accesed from the Excel sheet into SearchBox and navigated to SearchResults page");
		}
		
		catch (Exception e) {
			Log.testLoggerError(log, "The Values could not be accesed from the Excel sheet");
			ExtentUtility.fail(test,driver, "The Values could not be accesed from the Excel sheet");
		}
	}
	
	public static void hoverLink(WebDriver driver,Logger log,ExtentTest test) {
		try {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@href='/collections/unique-gifts'])[2]"))).perform();
		a.moveToElement(driver.findElement(By.xpath("(//li[@class='is-focused']//a[@href='/collections/birthday-gifts']"))).click().build().perform();
		Log.testLoggerInfo(log, "Navigated to SearchResults page");
		ExtentUtility.pass(test, "Navigated to SearchResults page");
		}
		catch(Exception e) {
			Log.testLoggerDebug(log, "SearchResult page found within HomePage");
			ExtentUtility.fail(test,driver, "Not navigated to SearchResults page but SearchResult page found within HomePage");
		}
	}
	
	public static void clickDCLogo(WebDriver driver,Logger log,ExtentTest test) {
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("window.scrollBy(0,4600)");
	    Thread.sleep(1000);
		DriverFunctions.click(driver, dcLogo);
		Log.testLoggerInfo(log, "Navigated to SearchResults page");
		ExtentUtility.pass(test, "Navigated to SearchResults page");
		}
		catch(Exception e){
			Log.testLoggerError(log, "Not navigated to SearchResults page");
			ExtentUtility.fail(test,driver, "Not navigated to SearchResults page");
		}
	}
	
	public static void clickCart(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, cartBtn);
				Log.testLoggerInfo(log, "Cart Page popped");
				ExtentUtility.pass(test, "Cart Page popped");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Cart Page not popped");
			ExtentUtility.fail(test, driver, "Cart Page not popped");
		}
	}
	
	public static void clickWishList(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, wishList);
				Log.testLoggerInfo(log, "Navigated to wishlist page");
				ExtentUtility.pass(test, "Navigated to wishlist page");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Not navigated to wishlist page");
			ExtentUtility.fail(test, driver, "Not navigated to wishlist page");
		}
	}
	
	public static void clickAboutUs(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, aboutUs);
				Log.testLoggerInfo(log, "Navigated to About Us page");
				ExtentUtility.pass(test, "Navigated to About Us page");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Not navigated to About Us page");
			ExtentUtility.fail(test, driver, "Not navigated to About Us page");
		}
	}
	public static void clickContactUs(Logger log, WebDriver driver, ExtentTest test) {
		try {
			    DriverFunctions.click(driver, contactUs);
				Log.testLoggerInfo(log, "Navigated to Contact Us page");
				ExtentUtility.pass(test, "Navigated to Contact Us page");
			}
		
		catch (Exception e) {
			Log.testLoggerError(log, "Not navigated to Contact Us page");
			ExtentUtility.fail(test, driver, "Not navigated to Contact Us page");
		}
	}
}
