package com.learn.java;

public class MyFirstMavenApp {

	
	public static void main(String[] args) {
		StringModifier stringModifier = new  StringModifier();
		String modifiedString = stringModifier.appendSensitiveWaring("My maven message. ");
		
		System.out.println(modifiedString);
		
	}
}
