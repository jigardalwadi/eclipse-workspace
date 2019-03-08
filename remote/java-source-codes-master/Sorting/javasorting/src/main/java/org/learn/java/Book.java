package org.learn.java;

public class Book implements Comparable<Book>{

	private int id;
	private String name;

	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public int compareTo(Book anotherBook) {
		if (this.id < anotherBook.getId()){
			return 1;
		} else if (this.id > anotherBook.getId()){
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	
	
	

}
