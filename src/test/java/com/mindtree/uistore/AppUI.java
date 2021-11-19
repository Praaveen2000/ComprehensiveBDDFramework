package com.mindtree.uistore;

import org.openqa.selenium.By;

import com.mindtree.reusableComponents.WebDriverHelper;

public class AppUI extends WebDriverHelper {
	public static By signIn = By.xpath("(//a[@href='/account/login'])[2]");
	public static By returnLoginBtn = By.xpath("//a[@href='https://www.bigsmall.in/account/login']");
	public static By eMail = By.id("CustomerEmail");
	public static By passWord = By.id("CustomerPassword");
	public static By SignInBtn = By.xpath("//input[@value='Sign In']");
	public static By forgotButton = By.id("RecoverPassword");
	public static By recoverEmail = By.id("RecoverEmail");
	public static By submitBtn = By.xpath("//input[@value='Submit']");
	public static By searchBox = By.xpath("(//input[@name='q'])[1]");
	public static By playMatProduct = By.xpath("//a[@href='/products/children-play-mat']");
	public static By wishListBtn = By.xpath("//div[@data-position='default']//button");
	public static By birthdayGifts1000 = By.xpath("(//a[@href='https://www.bigsmall.in/collections/birthday-gifts-within-1000']");
	public static By adiyogiGift = By.xpath("//a[@href='/products/lord-shiva-adiyogi-figurine']");
	public static By siteLogo = By.xpath("(//a[@itemprop='url'])[1]");
	public static By addToCart = By.xpath("//button[@name='add']");
	public static By closeCart = By.xpath("//div[@class='drawer__close text-right']//button");
	public static By dcLogo = By.xpath("//div[@class='logo-bar__item']//a[@href='/collections/dc-merchandise']");
	public static By supermanBottle = By.xpath("//a[@href='/products/superman-shaker-bottle']");
	public static By codeCheckBox = By.id("PostalCode");
	public static By codeCheckBtn = By.xpath("//button[text()='Check']");
	public static By cartBtn = By.xpath("(//a[@href='/cart'])[2]");
	public static By removeBtn = By.xpath("//div[@class='grid__item one-quarter text-right']//button");
	public static By continueShop = By.xpath("(//a[@href='javascript:void(0);'])[2]");
	public static By checkoutBtn = By.xpath("//button[@name='checkout']");
	public static By closePopUp = By.xpath("//div[@class='wa-optin-widget-close-btn']//img");
	public static By returnToCart= By.xpath("//a[@href='https://www.bigsmall.in/cart']");  
	public static By wishList = By.xpath("//div[@class='site-nav__icons']//a[@href='#swym-wishlist']");
	public static By removeWishList = By.xpath("//li[@class='swym-remove']//a");
	public static By accessWishList = By.id("swym-welcome-button");
	public static By aboutUs = By.xpath("//a[@href='/pages/about-us']");
	public static By faceBookBtn = By.xpath("//a[@href='https://www.facebook.com/thebigsmallstore']");
	public static By contactUs = By.xpath("//a[@href='/pages/contact-us']");
	public static By contactName = By.id("ContactFormName-page-contact-template-0");
	public static By contactEmail = By.id("ContactFormEmail-page-contact-template-0");
	public static By contactMsg = By.id("ContactFormMessage-page-contact-template-0");
	public static By contactSubmitBtn = By.xpath("//button[@class='btn']");
}
