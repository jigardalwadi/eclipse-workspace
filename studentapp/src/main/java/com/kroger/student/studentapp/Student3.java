package com.kroger.student.studentapp;

public class Student3 {

	private int id;
	private String FirstName;
	private String LastName;
	private Address address;
	
	
	public Student3(int id, String firstName, String lastName, Address address) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", address=" + address
				+ "]";
	}
	
	
}
