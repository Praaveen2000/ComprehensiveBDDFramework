package com.mindtree.stepDefinition;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.mindtree.pageObject.HomePage;
import com.mindtree.pageObject.LaundryDescription;
import com.mindtree.pageObject.PowderPage;
import com.mindtree.pageObject.AntiBacterialPage;
import com.mindtree.reusableComponents.WebDriverHelper;
import com.mindtree.utility.OpenCloseChrome;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TideStepDefinition extends WebDriverHelper {
	public static Logger log;
	public static ExtentTest extentTest;
	public static ExtentReports extent;

	@Given("^User launches the Chrome Browser$")
    public void user_launches_the_chrome_browser() throws Throwable {
		driver = DriverSetUp();
    }

    @When("^User opens URL of TideStore$")
    public void user_opens_url_of_tidestore() throws Throwable {
    	System.out.println("URL opened successfully");
    }

    @Then("^User should see the homepage of TideStore$")
    public void user_should_see_the_homepage_of_tidestore() throws Throwable {
    	log = Logger.getLogger(TideStepDefinition.class.getName());
		extent = new ExtentReports(System.getProperty("user.dir") + "\\Testreports\\" + date + "_ExtentReport.html",
				false);
		extentTest = extent.startTest("PowderTextCheck");
    }

    @Then("^User hovers on shopProducts and clicks on powder$")
    public void user_hovers_on_shopproducts_and_clicks_on_powder() throws Throwable {
    	
		HomePage.powderClick(log, driver, extentTest);
    }

    @Then("^PowderSearch Page appears$")
    public void powdersearch_page_appears() throws Throwable {
        System.out.println("PowderPage appeared successfully");
    }

    @And("^User verifies the PowderText$")
    public void user_verifies_the_powdertext() throws Throwable {
        PowderPage.checkPowderText(driver, log, extentTest);
        Thread.sleep(3000);
        extent.flush();
    }
    @Given("User is on homepage of TideStore")
    public void user_is_on_homepage_of_tide_store() {
       System.out.println("Returned from PowderPage to HomePage");
    }
    @When("User enters {string} in searchBox and clicks on find")
    public void user_enters_in_search_box_and_clicks_on_find(String string) {
        HomePage.enterSearchBox(log, driver, extentTest, string);
    }
    @Then("User is navigated to AntiBacterial Page")
    public void user_is_navigated_to_anti_bacterial_page() {
        System.out.println("AntibacterialPage appeared successfully ");
    }
    @Then("User verifies the AntiBacterial Text")
    public void user_verifies_the_anti_bacterial_text() throws InterruptedException {
        AntiBacterialPage.checkAntiBacterialText(driver, log, extentTest);
        Thread.sleep(3000);
        extent.flush();
    }
    @Given("From homepage of eLocalStore")
    public void from_homepage_of_e_local_store() {
        System.out.println("Returend from AntiBacterialPage to HomePage");
    }
    @When("User clicks on learnMore")
    public void user_clicks_on_learn_more() throws InterruptedException {
    	JavascriptExecutor js = (JavascriptExecutor) driver;  
    	js.executeScript("window.scrollBy(0,2850)");
        HomePage.laundryLearn(driver, log, extentTest);     
    }
    @Then("User is navigated to LaundryPage")
    public void user_is_navigated_to_Laundry_page() {
         System.out.println("How to Laundry Page appeared successfully");   
    }
    @Then("User verifies the LaundryText")
    public void user_verifies_the_laundry_text() throws InterruptedException {
        LaundryDescription.checkLaundryText(driver, log, extentTest);
        Thread.sleep(3000);
		extent.flush();
		extent.endTest(extentTest);
		extent.close();
		OpenCloseChrome.quitDriver(driver);
    }

}
