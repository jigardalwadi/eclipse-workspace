package org.learn.java;

//public class Author implements Comparable<Author> {
public class Author {
	private Integer id;
	private String name;

	public Author(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public int compareTo(Author o) {
		return this.getName().compareToIgnoreCase(o.getName());
	}*/

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}

}
