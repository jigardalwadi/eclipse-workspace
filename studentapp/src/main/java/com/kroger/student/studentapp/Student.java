package com.kroger.student.studentapp;

import java.util.Comparator;

public class Student {
	//public final static String SCHOOL_NAME = "ksqaure";
	private int id;
	private String FirstName;
	private String LastName;
	private float gpa;
	
	
	public Student(int id, String firstName, String lastName, float gpa) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.gpa = gpa;
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
	
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gpa=" + gpa + "]";
	}



	public int compareTo(Student s1) {
		//return this.FirstName.compareTo(s1.getFirstName());
				//implementation of the above line
		String instance = this.FirstName;
		String another = s1.getFirstName();
		int diff = instance.compareTo(another);
		return diff;
	
	}
	

	
	
}
