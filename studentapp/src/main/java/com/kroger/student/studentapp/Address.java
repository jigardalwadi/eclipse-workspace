package com.kroger.student.studentapp;

public class Address implements Comparable<Address>{
	private String state;
	private int zipcode;
	
	
	public Address(String state, int zipcode) {
		// TODO Auto-generated constructor stub
		this.state = state;
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", zipcode=" + zipcode + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public int compareTo(Address o) {
		return this.getZipcode()-o.getZipcode();
	}
	
	
	
}
