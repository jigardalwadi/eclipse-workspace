package org.learn.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingApplication3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = Arrays.asList(new Book[]{
				new Book(10015, "Tom and jerry", new Author(1, "Tolkein")),
				new Book(10016, "Tom and jerry", new Author(57, "Tolkein")),
				new Book(1005, "Crime and punishment", new Author(5, "Russel")),
				new Book(20000, "The man and the sea", new Author(2, "Shaw")),
				new Book(5, "Things fall apart", new Author(1005, "Hemingway")),
				new Book(7, "The lord of the rings", new Author(37, "Erich"))
				
		});
		
		System.out.println(books);
		
		/*Collections.sort(books, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getAuthor().getName().compareToIgnoreCase(o2.getAuthor().getName());
			}
			
		});*/
		
		List<Book> sortedByStream = books.stream().sorted(
				(book1, book2) -> 
				//{return book1.getAuthor().getName().compareToIgnoreCase(book2.getAuthor().getName());}
				book1.getAuthor().getName().compareToIgnoreCase(book2.getAuthor().getName())
				)
				//.map(x->{return new Book(0, null, null);})
				.collect(Collectors.toList());
		
		
		
		//Collections.reverse(books);
		System.out.println(sortedByStream);
		
		//books.sort(c);
		
		}

}
