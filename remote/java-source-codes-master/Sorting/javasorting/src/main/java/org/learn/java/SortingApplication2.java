package org.learn.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApplication2 {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book[]{
				new Book(10015, "Tom and jerry"),
				new Book(1005, "Crime and punishment"),
				new Book(20000, "The man and the sea"),
				new Book(5, "Things fall apart"),
				new Book(7, "The lord of the rings")
				
		});
		
		System.out.println(books);
		Collections.sort(books);
		Collections.reverse(books);
		System.out.println(books);
		
		/*Book book1 = new Book(10015, "Tom and jerry");
		Book book2 = new Book(1005, "Crime and punishment");
		//System.out.println(book1.compareTo(book2));
		System.out.println(book2.compareTo(book1));*/
	}

}
