package org.learn.java;

import java.io.Serializable;

public class Author implements Serializable {

	private static final long serialVersionUID = 2184362630050578081L;
	private int id;
	private String name;
	private String description;

	public Author(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	
}
