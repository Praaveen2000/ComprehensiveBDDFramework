package com.mindtree.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseChrome {

	public static WebDriver initDriver(WebDriver driver, ReadPropertyFile rp) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + rp.getDriver());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(rp.getWait(), TimeUnit.SECONDS);
		driver.get(rp.getUrl());
		return driver;
	}
	public static void quitDriver(WebDriver driver) {
		driver.quit();
		
	}

}
