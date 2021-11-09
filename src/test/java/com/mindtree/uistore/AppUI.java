package com.mindtree.uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mindtree.reusableComponents.WebDriverHelper;

public class AppUI extends WebDriverHelper {
	
	public static WebElement shopProducts =driver.findElement(By.xpath("//a[@href='/en-us/shop']")); 
	public static WebElement powder = driver.findElement(By.xpath("(//a[@href='/en-us/shop/type/powder'])[1]"));
	public static By powderText = By.xpath("(//a[@href='/en-us/shop/type/powder/tide-free-powder'])[2]//p");
	public static By siteLogo = By.xpath("//a[@href='/en-us']");
	public static By searchBox = By.xpath("//input[@name='q']");
	public static By findIcon = By.xpath("//button[@type='submit']");
	public static By antiBacterialText = By
			.xpath("(//a[@href='https://tide.com/en-us/shop/type/fabric-care/tide-antibacterial-fabric-spray'])[2]//p");
	public static By learnMore = By.xpath("(//a[@href='/en-us/how-to-wash-clothes/how-to-do-laundry'])[2]");
	public static By laundryText = By
			.xpath("(//a[@href='/en-us/how-to-wash-clothes/how-to-do-laundry/how-to-read-laundry-symbols'])[2]//p");

}
