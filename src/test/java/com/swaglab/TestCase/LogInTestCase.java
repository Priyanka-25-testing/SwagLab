package com.swaglab.TestCase;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.swaglab.Util.Locator;
import com.swaglab.Util.OR;
import com.swaglab.Util.WaitFor;
import com.swaglabs.keywords.UIKeywords;

public class LogInTestCase extends BaseClass{
	@Test
	public void standerUserLoginEndtoEndProcess() {
		// TODO Auto-generated method stub
		
      UIKeywords.enterText(Locator.USER_NAME,"standard_user");
      UIKeywords.enterText(Locator.PASSWORD, "secret_sauce");
      UIKeywords.clickOnElement(Locator.LOGIN);
      UIKeywords.clickOnElement(Locator.SAUCE_LABS_BACKPACK);
      UIKeywords.clickOnElement(Locator.SAUCE_LABS_BIKE_LIGHT);
      UIKeywords.clickOnElement(Locator.SHOPPING_CART);
      UIKeywords.clickOnElement(Locator.CHECK_OUT);
      UIKeywords.enterText(Locator.FIRST_NAME,"Priyanka");
      UIKeywords.enterText(Locator.LAST_NAME, "Patil");
      UIKeywords.enterText(Locator.POSTAL_CADE, "411017");
      UIKeywords.clickOnElement(Locator.COUNTINUE);
      UIKeywords.clickOnElement(Locator.FINISH );
      System.out.println(UIKeywords.getElementText(Locator.TEXT));
      String cartcount=UIKeywords.getElementText(Locator.SHOPPING_CART);
      if(cartcount=="") {
    	  System.out.println("Pass");
      }else {
    	  System.out.println("Fail");
      }
	}
	
	@Test
	public  void verifyLockedOutUserLogIn() {
		// TODO Auto-generated method stub
		UIKeywords.enterText(Locator.USER_NAME,"locked_out_user");
	      UIKeywords.enterText(Locator.PASSWORD, "secret_sauce");
	     Boolean result= UIKeywords.isClickable(Locator.LOGIN);
	     if(result==false) {
	    	 System.out.println("Pass");
	     } else {
	    	 System.out.println("Fail");
	     }    
	}
	@Test
	public  void verifyErrorUserLogIn() {
		// TODO Auto-generated method stub
		UIKeywords.enterText(Locator.USER_NAME,"error_user");
	      UIKeywords.enterText(Locator.PASSWORD, "secret_sauce");
	      UIKeywords.clickOnElement(Locator.LOGIN);
	      UIKeywords.clickOnElement(Locator.SAUCE_LABS_BACKPACK);
	      UIKeywords.clickOnElement(Locator.SAUCE_LABS_BIKE_LIGHT);
	      UIKeywords.clickOnElement(Locator.SHOPPING_CART);
	      UIKeywords.clickOnElement(Locator.CHECK_OUT);
	      UIKeywords.enterText(Locator.FIRST_NAME,"Priyanka");
	      UIKeywords.enterText(Locator.LAST_NAME, "Patil");
	      UIKeywords.enterText(Locator.POSTAL_CADE, "411017");
	      UIKeywords.clickOnElement(Locator.COUNTINUE);
	      Boolean result=UIKeywords.isClickable(Locator.FINISH );
	      if(result==false) {
	    	  System.out.println("pass");
	      }else {
	    	  System.out.println("Fail");
	      }
	}
	@Test
	public  void verifyLowToHighFilter() {
		// TODO Auto-generated method stub
		UIKeywords.enterText(Locator.USER_NAME,"standard_user");
	      UIKeywords.enterText(Locator.PASSWORD, "secret_sauce");
	      UIKeywords.clickOnElement(Locator.LOGIN);
	      UIKeywords.clickOnElement(Locator.FILTERS);
	      UIKeywords.clickOnElement(Locator.FILTER_LOWTOHI);
	      UIKeywords.getElementsText(Locator.ALL_PRODUCT_PRICE);
	      
	}
	 @Test
	public void verifyTitleOFPage() {
		// TODO Auto-generated method stub
    
	}
}
