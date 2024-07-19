package com.swaglab.Util;
/**
 * 
 */
public class OR {
	public static  String getLocator(String key) {
		// TODO Auto-generated method stub
      FileUtility util = new FileUtility();
      String baseDir = System.getProperty("user.dir");
      return util.readproperty(baseDir+"/src/test/resources/OR.properties",key);
	}

}
