package com.swaglabs.Exceptions;

public class InvalidBrowserNameException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String browsername;
     public InvalidBrowserNameException(String browsername) {
		// TODO Auto-generated constructor stub
	this.browsername= browsername;
     }

	@Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	// System.err.println("Invalid Browser Name ");
    	return browsername;
    }
}
