package pages;

import org.openqa.selenium.WebDriver;

import uistore.Slippers;
import utils.WebDriverHelper;

public class SlipperPageObject {
	

	WebDriver driver;
	WebDriverHelper slipperPagehelper;
	Slippers locate2=new Slippers();
	
	public void hoveronProduct(WebDriver driver)
	{
	     slipperPagehelper=new WebDriverHelper(driver);
	     try {
	    	 slipperPagehelper.hoverOnElement(locate2.Slippers);
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	     public void clickonQuickView(WebDriver driver)
	 	{
	 	     slipperPagehelper=new WebDriverHelper(driver);
	 	     try {
	 	    	 slipperPagehelper.clickOnElement(locate2.QuickView);
	 			Thread.sleep(5000);
	 		} catch (Exception e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	}
	     public void clickonDetails(WebDriver driver)
		 	{
		 	     slipperPagehelper=new WebDriverHelper(driver);
		 	     try {
		 	    	 slipperPagehelper.clickOnElement(locate2.ViewDetails);
		 			Thread.sleep(5000);
		 		} catch (Exception e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		}


}
