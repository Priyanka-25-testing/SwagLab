package com.swaglab.Util;

public class Envoirnment {
	private static final String filepath=System.getProperty("user.dir")+"/src/main/resources/Envoirnment.properties";
	public static String getBrowserName() {
		// TODO Auto-generated method stub
		String browsername=getEnvProperty("browser.name");
		return browsername;
	}
	
	public static String getURL() {
		// TODO Auto-generated method stub
        
         return getEnvProperty("app.qa.url");
	}
	/**
	 * This method call read property which is in FileUtil to load env
	 * property of.property file And return the value of corresponding 
	 * key, in property file.Make private for access in same class.
	 * @param property
	 * @return
	 */
	
	private static String getEnvProperty(String property) {
		// TODO Auto-generated method stub
		FileUtility util = new FileUtility();
		String envProperty=util.readproperty(filepath,property);
        return envProperty;
	}
	
	

}
