package com.mindtree.stepDefinition;

import org.apache.log4j.Logger;

import com.mindtree.pageObject.AboutUsPage;
import com.mindtree.pageObject.BirthDayGiftsPage;
import com.mindtree.pageObject.CartPage;
import com.mindtree.pageObject.ContactUsPage;
import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.LoginPage;
import com.mindtree.pageObject.ProductDescriptionPage;
import com.mindtree.pageObject.ResetPasswordPage;
import com.mindtree.pageObject.SearchResultsPage;
import com.mindtree.pageObject.WishListPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.runner.BigsmallSiteRunner;
import com.mindtree.utility.OpenCloseChrome;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BigsmallStepDefinition extends WebDriverHelper {
	public static Logger log;
	public static ExtentTest extentTest;
	public static ExtentReports extent;
	
	@Given("^User is on the Bigsmall homepage$")
    public void user_is_on_the_bigsmall_homepage() throws Throwable {
		driver = DriverSetUp();
		log = Logger.getLogger(BigsmallSiteRunner.class.getName());
		extent = new ExtentReports(System.getProperty("user.dir") + "\\Testreports\\" + date + "_ExtentReport.html",
				false);
		extentTest = extent.startTest("addToWishlist");
    }
	
	@Given("^User is on the homepage of Bigsmall$")
    public void user_is_on_the_homepage_of_bigsmall() throws Throwable {
         System.out.println("User is on Bigsmall Home Page");
    }
	
	@When("User enters {string} in the searchbox and User clicks on enter")
	public void user_enters_in_the_searchbox_and_user_clicks_on_enter(String string) {
		HomePage.giftSearch(log, driver, extentTest,string);
	}
	
    @Then("^The searchtext results page appears$")
	public void the_searchtext_results_page_appears() throws Throwable {
	    System.out.println("Navigated to Search results page");      
    }

    @And("^User picks the desired choice of product$")
    public void user_picks_the_desired_choice_of_product() throws Throwable {
    	SearchResultsPage.pickMat(driver, log, extentTest);
    }

    @And("^User adds them to wishlist$")
    public void user_adds_them_to_wishlist() throws Throwable {
    	ProductDescriptionPage.addToWishList(driver, log, extentTest);
    	Thread.sleep(3000);
    	extent.flush();
    }
    
    @When("User hovers on gifts link and User clicks on Birthday Gifts")
    public void user_hovers_on_gifts_link_and_user_clicks_on_birthday_gifts() {
    	extentTest = extent.startTest("addToCart");
    	HomePage.hoverLink(driver, log, extentTest);
    }
    @Then("^The link results page appears$")
    public void the_link_results_page_appears() throws Throwable {
      	BirthDayGiftsPage.clickBirthDayGiftUnder1000(driver, log, extentTest);
    }
    
    @And("^User picks the desired choice of product under Header link results page$")
    public void user_picks_the_desired_choice_of_product_under_header_link_results_page() throws Throwable {
    	SearchResultsPage.pickAdiyogi(driver, log, extentTest);
    }
    @Then("User adds them to Cart")
    public void user_adds_them_to_cart() throws InterruptedException {
    	ProductDescriptionPage.addToCart(driver, log, extentTest);
    	Thread.sleep(3000);
    	extent.flush();
    }
    
    @When("^User clicks on DC logo under official Merchandise section$")
    public void user_clicks_on_dc_logo_under_official_merchandise_section() throws Throwable {
    	extentTest = extent.startTest("checkPIN");
		HomePage.clickDCLogo(driver, log, extentTest);
    }

    @Then("^The DCLogo results page appears$")
    public void the_dclogo_results_page_appears() throws Throwable {
    	System.out.println("Computing results...");
    	Thread.sleep(2000);
    }
    
    @And("^User picks the Superman Bottle$")
    public void user_picks_the_superman_bottle() throws Throwable {
    	SearchResultsPage.pickBottle(driver, log, extentTest);
    }
    
    @And("User enters his or her {string} and User clicks on check button")
    public void user_enters_his_or_her_and_user_clicks_on_check_button(String string) throws InterruptedException {
    	ProductDescriptionPage.checkCode(driver, log, extentTest,string);
    	System.out.println("Notification is displayed");
    	Thread.sleep(3000);
    	extent.flush();
    }
    
    @Then("^Notification about Delivery appears$")
    public void notification_about_delivery_appears() throws Throwable {
    	extentTest = extent.startTest("retirievePass");
    }
   
    @When("^User clicks on SignIn button$")
    public void user_clicks_on_signin_button() throws Throwable {
		HomePage.clickSignIn(log, driver, extentTest);
    }
    

    @Then("^The Login page appears$")
    public void the_login_page_appears() throws Throwable {
        System.out.println("Navigating to Login Page.....");
        Thread.sleep(2000);
    }
    
    @And("^User clicks on forgot button$")
    public void user_clicks_on_forgot_button() throws Throwable {
    	LoginPage.clickForgot(log, driver, extentTest);
		
    }
    
    @And("^User enters his or her \"([^\"]*)\" and clicks on submit button$")
    public void user_enters_his_or_her_something_and_clicks_on_submit_button(String arg1) throws Throwable {
    	ResetPasswordPage.forgotPassword(log, driver, extentTest,arg1);
    }

    @Then("^Notification about password reset link sent to Email appears$")
    public void notification_about_password_reset_link_sent_to_email_appears() throws Throwable {
    	Thread.sleep(3000);
    	extent.flush();
    	extentTest = extent.startTest("shopCheckout");
    }

    @When("^User clicks on Cart button$")
    public void user_clicks_on_cart_button() throws Throwable {
    	
		HomePage.clickCart(log, driver, extentTest);
    }
    
    @Then("^The Cart page appears$")
    public void the_cart_page_appears() throws Throwable {
        System.out.println("Navigating to Cart Page...");
        Thread.sleep(2000);
    }
    
    @And("^User clicks on Go to Checkout button$")
    public void user_clicks_on_go_to_checkout_button() throws Throwable {
    	CartPage.clickCheckout(log, driver, extentTest);
    }
    
    @Then("^Whatsapp page popup appears and when User closes it the Checkout page appears$")
    public void whatsapp_page_popup_appears_and_when_user_closes_it_the_checkout_page_appears() throws Throwable {
        System.out.println("Returning to LoginPage from Checkout......");
    }
    
    @And("^User clicks on Return to Cart$")
    public void user_clicks_on_return_to_cart() throws Throwable {
    	System.out.println("Returning to HomePage from cart page......");
    	Thread.sleep(3000);
    	extent.flush();
    	extentTest = extent.startTest("cartRemove");
    }
    
    @And("^User clicks on remove button$")
    public void user_clicks_on_remove_button() throws Throwable {
		CartPage.clickRemove(log, driver, extentTest);
    }
    
    @Then("^Item is removed from Cart$")
    public void item_is_removed_from_cart() throws Throwable {
        System.out.println("Item removed");
        Thread.sleep(3000);
        extent.flush();
    }
    
    @When("^User clicks on Wishlist button$")
    public void user_clicks_on_wishlist_button() throws Throwable {
    	extentTest = extent.startTest("wishListRemove");
		HomePage.clickWishList(log, driver, extentTest);
    }

    @Then("^The Wishlist page appears$")
    public void the_wishlist_page_appears() throws Throwable {
          System.out.println("Wishlist page appears");
    }
    
    @And("^User clicks on access wishlist and clicks on remove button$")
    public void user_clicks_on_access_wishlist_and_clicks_on_remove_button() throws Throwable {
    	WishListPage.clickRemove(log, driver, extentTest);
    }

    @Then("^Item is removed from Wishlist$")
    public void item_is_removed_from_wishlist() throws Throwable {
    	System.out.println("Item removed");
    	Thread.sleep(3000);
    	extent.flush();
    }
    
    @When("^User clicks on Contact Us button$")
    public void user_clicks_on_contact_us_button() throws Throwable {
    	extentTest = extent.startTest("ContactUs");
		HomePage.clickContactUs(log, driver, extentTest);
		
    }
    
    @Then("^The Contact Us page appears$")
    public void the_contact_us_page_appears() throws Throwable {
        System.out.println("Contact Page appears");
    }
    
    @Then("User enters {string},{string} and {string} and clicks on submit button")
    public void user_enters_and_and_clicks_on_submit_button(String string, String string2, String string3) {
    	ContactUsPage.enterDetails(log, driver, extentTest,string,string2,string3);
    }
    
    @Then("^Notification appears$")
    public void notification_appears() throws Throwable {
        System.out.println("Notification success");
        Thread.sleep(3000);
        extent.flush();
        extentTest = extent.startTest("validLogin");
    }
    @When("User clicks on Sign In button")
    public void user_clicks_on_sign_in_button() {
    	HomePage.clickSignIn(log, driver, extentTest);
    }
    @Then("User enters {string},{string} and clicks on Sign In")
    public void user_enters_and_clicks_on_sign_in(String string, String string2) {
    	LoginPage.loginValid(log, driver, extentTest,string,string2);
    }
    
    @Then("^HomePage appears with User logged into his or her account$")
    public void homepage_appears_with_user_logged_into_his_or_her_account() throws Throwable {
        System.out.println("User is logged in");
        Thread.sleep(3000);
        extent.flush();
    }
    
    @When("^User clicks on About Us button$")
    public void user_clicks_on_about_us_button() throws Throwable {
    	extentTest = extent.startTest("AboutUs");
		HomePage.clickAboutUs(log, driver, extentTest);
    }

    @Then("^The About Us page appears$")
    public void the_about_us_page_appears() throws Throwable {
        System.out.println("About us page appears");
    }
    @Then("User clicks on Facebook link")
    public void user_clicks_on_facebook_link() {
    	AboutUsPage.clickFacebook(log, driver, extentTest);
    }
    
    @Then("Bigsmall Facebook home page appears")
    public void bigsmall_facebook_home_page_appears() throws InterruptedException {
    	Thread.sleep(3000);
    	extent.flush();
    	extent.endTest(extentTest);
		OpenCloseChrome.quitDriver(driver);
    }

}
