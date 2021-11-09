package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyFile {
	static Properties prop;

	public ReadPropertyFile() {
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("./testdata/config.properties");
			try {
				prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getBrowser() {
		String browser = prop.getProperty("Browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser not specified");

	}

	public String getDriver() {
		String driver = prop.getProperty("ChromeDriver");
		if (driver != null)
			return driver;
		else
			throw new RuntimeException("ChromeDriver not specified");

	}

	public String getUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("URL not specified");

	}

	public Long getWait() {
		long implicitWait = Long.parseLong(prop.getProperty("implicitWait"));
		if (implicitWait != 0)
			return implicitWait;
		else
			throw new RuntimeException("Wait not specified");

	}

	public String getExcelPath() {
		String excelPath = prop.getProperty("excelPath");
		if (excelPath != null)
			return excelPath;
		else
			throw new RuntimeException("Excel Path not specified");

	}

}
