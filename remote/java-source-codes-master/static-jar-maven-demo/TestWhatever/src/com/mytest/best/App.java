package com.mytest.best;

//import com.mytest.best.StringModifier;
public class App {

	public static void main(String[] args) {
		StringModifier modifier = new StringModifier();
		
		String modifiedString = modifier.appendSensitiveWaring("This is meant for VA employee. I am sam.");
		System.out.println(modifiedString);
	}

}
