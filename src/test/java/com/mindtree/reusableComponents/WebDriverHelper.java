package com.mindtree.reusableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.mindtree.utility.OpenCloseChrome;
import com.mindtree.utility.ReadPropertyFile;

public class WebDriverHelper {
	public static WebDriver driver;
	public static ReadPropertyFile rp;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static FileInputStream stream;
	public static String date = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss").format(new Date());

	static {
		SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		System.setProperty("currenttime", dateForm.format(new Date()));
	}

	public WebDriver DriverSetUp() {
		rp = new ReadPropertyFile();
		switch (rp.getBrowser()) {
		case "chrome": {
			driver = OpenCloseChrome.initDriver(driver, rp);
			break;
		}
		default: {
			System.out.println("Invalid Browser");
			break;
		}
		}

		try {
			stream = new FileInputStream(System.getProperty("user.dir") + rp.getExcelPath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			workbook = new XSSFWorkbook(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheetAt(0);
		return driver;
	}

}
