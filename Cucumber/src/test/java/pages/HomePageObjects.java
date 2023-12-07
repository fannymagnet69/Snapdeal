package pages;

import org.openqa.selenium.WebDriver;

import uistore.HomePageLocators;
import utils.WebDriverHelper;

public class HomePageObjects {

	WebDriver driver;
	WebDriverHelper homePagehelper;
	HomePageLocators locate=new HomePageLocators();
	
	
	public void hoveronHomePage(WebDriver driver)
	{
	     homePagehelper=new WebDriverHelper(driver);
	     try {
			homePagehelper.hoverOnElement(locate.category);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnElement(WebDriver driver)
	{
		 homePagehelper=new WebDriverHelper(driver);
		 try {
			homePagehelper.clickOnElement(locate.Slippers);
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
