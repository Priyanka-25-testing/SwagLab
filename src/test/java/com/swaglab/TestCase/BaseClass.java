package com.swaglab.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.swaglab.Util.Envoirnment;
import com.swaglabs.keywords.UIKeywords;

public class BaseClass {
	
	@BeforeMethod
	
	public void setUp() throws Exception {
		UIKeywords.openBrowser(Envoirnment.getBrowserName());
//		String env=System.getProperty("env");
//		System.out.println(env);
//		if(env==null) {
//			env="qa";
//			System.out.println("Launching url ");
//		}
//		System.out.println("Launching url "+env+" envoirnment");
		UIKeywords.launchUrl(Envoirnment.getURL());
	}
	
	@AfterMethod
	public  void tearDown() {
		// TODO Auto-generated method stub
      UIKeywords.closeBrowser();
	}
	
//	@Test
//	public  void m1() {
//		// TODO Auto-generated method stub
//     System.out.println("First test");
//	}
	
	
}
