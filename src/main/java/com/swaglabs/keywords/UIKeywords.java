package com.swaglabs.keywords;

import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.swaglab.Util.Envoirnment;
import com.swaglab.Util.FileUtility;
import com.swaglabs.Exceptions.InvalidBrowserNameException;

/**
 * This is keyword class use to perform action on Web page
 * 
 */
public class UIKeywords {
	public static RemoteWebDriver driver;
	public static ChromeOptions options;

	/**
	 * This method is used to openBrowser , called in Baseclass.
	 * 
	 * @param browsername thorws invalidBrowserNameExceptions.
	 */
	public static void disableNotifications() {
		// TODO Auto-generated method stub
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	}
	public static void openBrowser(String browsername) {
		// TODO Auto-generated method stub
		disableNotifications();
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(options);
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase(" Edge")) {
			driver = new EdgeDriver();
		} else {
			throw new InvalidBrowserNameException(browsername);

		}
		driver.manage().window().maximize();
	}

	/**
	 * This is method used to launch url
	 * 
	 * @param env
	 */
	public static void launchUrl(String env) {
		// TODO Auto-generated method stub
//		FileUtility fileUtil = new FileUtility();
//		String baseDir= System.getProperty("user.dir");
//		String url= fileUtil.readproperty(baseDir+"/src/main/resources/Envoirnment.properties",env);
		driver.get(env);
		// Envoirnment.getURL();
	}
   /**
    * This method is no longer in use .Instead you can consider
    * {@code clickonElement(String locator)}.This method will be remove from
    * upcoming version of framework 
    * @param element
    */
	@Deprecated  
	public static void clickOnElement(WebElement element) {
		// TODO Auto-generated method stub
		element.click();
	}
	
	public static void clickOnElement(String locator) {
		// TODO Auto-generated method stub
      driver.findElement(By.cssSelector(locator)).click();
	}

    public static void enterText(String locator, String text) {
		// TODO Auto-generated method stub
     driver.findElement(By.cssSelector(locator)).sendKeys(text);
	}
    
    public static  void closePopUp(String locator) {
		// TODO Auto-generated method stub
    driver.findElement(By.cssSelector(locator));
	}
    
    private List <String> getTexts(String locator) {
		// TODO Auto-generated method stub
       List<WebElement> items=driver.findElements(By.cssSelector(locator));
       List <String> itemTexts = new ArrayList<String>();
       for (WebElement item : items) {
		itemTexts.add(item.getText());
	}
       return itemTexts;
	}
    
    public static Boolean isClickable(String locator) {
		// TODO Auto-generated method stub
    	Boolean result= driver.findElement(By.cssSelector(locator)).isSelected();
    return result;
	}
    public static String getElementText(String locator) {
		// TODO Auto-generated method stub
      return driver.findElement(By.cssSelector(locator)).getText();
	}
    
    public static void getElementsText(String locator) {
		// TODO Auto-generated method stub
    List <WebElement>items=driver.findElements(By.cssSelector(locator));
    ArrayList al=new ArrayList();
    ArrayList al2 = new ArrayList();
    
    double [] d =new double[items.size()];
    for (WebElement item : items) {
    	
	  String [] pr=item.getText().split("$");
	  String p = pr[1];
	  System.out.println(pr);
	  al.add(Double.parseDouble(p));
    }
    al2.sort((Comparator)al);
    if(al2.equals(al)) {
    	System.out.println("Pass");
    }else {
    	System.out.println("Fail");
    }
   
	}

	public static void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

}
