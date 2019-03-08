package org.learn.java;

//public class Book implements Comparable<Book> {
public class Book {
	private int id;
	private String name;
	private Author author;

	public Book(int id, String name, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public int compareTo(Book anotherBook) {
		return this.getAuthor().compareTo(anotherBook.getAuthor());
	}*/

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
