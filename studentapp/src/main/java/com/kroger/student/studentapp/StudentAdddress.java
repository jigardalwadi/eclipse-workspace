package com.kroger.student.studentapp;

public class StudentAdddress extends Address{
	private int id;
	private String FirstName;
	private String LastName;
	Address address;
	
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
	
	public StudentAdddress(String state, int zipcode, int id, String firstName, String lastName) {
		super(state, zipcode);
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Student_Adddress [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", address="
				+ address + "]";
	}
	
	
	
}
