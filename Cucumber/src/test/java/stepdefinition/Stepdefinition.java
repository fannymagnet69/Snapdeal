package stepdefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePageObjects;
import pages.SlipperPageObject;
import utils.Base;


public class Stepdefinition {
	
	public static WebDriver driver;
	Base call=new Base();
	HomePageObjects home=new HomePageObjects();
	SlipperPageObject slipper=new SlipperPageObject();

	@Before
	public void before()
	{
		
	}
	
	
	@Given("User is in the website")
	public void user_is_in_the_website() {
		
		driver=call.openBrowser();
			call.openUrl(driver);
		
		
	}

	@When("^User is clicks on the category$")
	public void user_is_clicks_on_the_category() throws Throwable {
	    home.hoveronHomePage(driver);
	}

	@When("^User clicks on slippers and flip flops$")
	public void user_clicks_on_slippers_and_flip_flops() throws Throwable {
	   
		home.clickOnElement(driver);
	}

	@Then("^user is redirected to a new Page where he verifies$")
	public void user_is_redirected_to_a_new_Page_where_he_verifies() throws Throwable {
		slipper.clickonQuickView(driver);
		slipper.clickonQuickView(driver);
		slipper.clickonDetails(driver);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
