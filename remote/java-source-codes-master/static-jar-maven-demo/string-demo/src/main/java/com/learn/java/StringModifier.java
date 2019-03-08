package com.learn.java;

import static org.apache.commons.lang3.StringUtils.appendIfMissingIgnoreCase;

public class StringModifier {
	
	private String name;
	public static int myInt = 1000;
	
	public String appendSensitiveWaring(String message) {
		return appendIfMissingIgnoreCase(message, "This is meant for VA employee");
	}
	
	private String test(){
		return null;
	}
	
	protected String best(){
		return null;
	}
	
	int myIntMethod(){
		return 0;
	}
}
