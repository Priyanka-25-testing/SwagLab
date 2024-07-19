package com.swaglab.Util;

public interface Locator {
	String USER_NAME="input#user-name";
    String PASSWORD="input#password";
    String LOGIN="input#login-button";

	String SAUCE_LABS_BACKPACK ="button#add-to-cart-sauce-labs-backpack";
	String SAUCE_LABS_BIKE_LIGHT ="button#add-to-cart-sauce-labs-bike-light";
	String SAUCE_LABS_BOLT_T_SHIRT="button#add-to-cart-sauce-labs-bolt-t-shirt";
	String SAUCE_LABS_FLEES_JACKET="button#add-to-cart-sauce-labs-fleece-jacket";
	String SAUCE_LABS_ONESIE="button#add-to-cart-sauce-labs-onesie";
	String	TEST_ALLTHETHINGST_SHIRTRED="button[name*='add-to-cart-test.allthethings()-t-shirt-(red)']";
	String	FILTERS ="select.product_sort_container";
	String	SHOPPING_CART="a.shopping_cart_link";
	String	SELECT_OPTIONS="button#react-burger-menu-btn";
	String 	ALL_ITEMS ="a#inventory_sidebar_link";
	String	ABOUT ="a#about_sidebar_link";
	String	LOG_OUT="a#logout_sidebar_link";
	String	RESET_APP_STATE ="a#reset_sidebar_link";
	String	COUNTINUE_SHIPPING="button#continue-shopping";
	String 	CHECK_OUT="button#checkout";
	String	SAUCE_LABS_BACKPACK1="button#remove-sauce-labs-backpack";
    String	CLOSE_BUTTON_POPUPS="button#react-burger-cross-btn";
	String	FIRST_NAME="input#first-name";
	String	LAST_NAME="INPUT#last-name";
	String	POSTAL_CADE="INPUT#postal-code";
	String	COUNTINUE ="INPUT#continue";
	String	CANCEL ="BUTTON#cancel";
	String	FINISH ="BUTTON#finish";
	String	TEXT ="h2[data-test*=complete-header]";
    String	BACK_HOME="BUTTON#back-to-products";
    String FILTER_LOWTOHI="option[value*=lohi]";
    String ALL_PRODUCT_PRICE="div.inventory_item_price";
}
