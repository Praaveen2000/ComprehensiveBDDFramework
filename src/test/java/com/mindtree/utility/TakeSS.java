package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSS {

	public static String ScreenShot(WebDriver driver,String name) throws IOException {
		TakesScreenshot take = (TakesScreenshot) driver;
		File srcFile = take.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy hh mm ss");
		Date date = new Date();
		String dateForm = dateFormat.format(date);
		String destination = System.getProperty("user.dir") + "//FailedScreenShot//" + dateForm + "_" + name + "err.png";
		File destFile = new File(destination);
		FileUtils.copyFile(srcFile, destFile);
		return destination;
	}

}
