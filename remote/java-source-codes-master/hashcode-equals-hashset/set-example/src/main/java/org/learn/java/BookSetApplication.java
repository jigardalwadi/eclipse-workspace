package org.learn.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BookSetApplication {

	public static void main(String[] args) {
		Book book1 = new Book(10, "The best book");
		Book book2 = new Book(10, "The best book");
		Book book3 = new Book(11, "test book");
		Book book4 = new Book(13, "No name");
		Book book5 = new Book(15, "ABC of economics");

		Set<Book> bookSet = new HashSet<>(5);
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		bookSet.add(book5);

		List<Book> bookList = bookSet
				.stream()
				.filter(book -> {
					// System.out.println(book);
					return book.getId() > 13;
				})
				.collect(Collectors.toList());
		
		
		
		bookList.stream().forEach(System.out::println);

		
		
		Iterator<Book> bookIterator = bookSet.iterator();
		while (bookIterator.hasNext()) {
			Book book = bookIterator.next();
			System.out.println(book);
			// WHAT WILL HAPPEN IF WE SAY AS FOLLOWS
			// bookSet.remove(book);
		}

		// System.out.println(book1.hashCode());
		// System.out.println(book2.hashCode());

	}

}
