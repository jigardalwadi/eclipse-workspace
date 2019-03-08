package org.learn.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeralizationExampleApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*Author author = new Author(1, "John Doe", "He is a middle aged mad man");
		
		FileOutputStream fileOutputStream = new FileOutputStream(new File("ourfile.ser"));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(author);
		
		objectOutputStream.flush();
		
		objectOutputStream.close();*/
		
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream(new File("ourfile.ser")));
				
		Author author = (Author) objectInputStream.readObject();
		System.out.println(author);
		
		objectInputStream.close();
				
				
				
				
				
				
		
		

	}

}
