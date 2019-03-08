package com.kroger.student.studentapp;

public class Student1 implements Comparable<Student1>{
		//public final static String SCHOOL_NAME = "ksqaure";
		private int id;
		private String FirstName;
		private String LastName;
		private float gpa;
		private Address address;
		
		
		public Student1(int id, String firstName, String lastName, float gpa, Address address) {
			//super();
			this.id = id;
			FirstName = firstName;
			LastName = lastName;
			this.gpa = gpa;
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
		
		public float getGpa() {
			return gpa;
		}
		public void setGpa(float gpa) {
			this.gpa = gpa;
		}
		
		



		public Address getAddress() {
			return address;
		}



		public void setAddress(Address address) {
			this.address = address;
		}



		@Override
		public String toString() {
			return "Student1 [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", gpa=" + gpa
					+ ", address=" + address + "]";
		}



		public int compareTo(Student1 s) {
			
			/*return this.address.getZipcode().compareTo(s1.address.getZipcode()) == 0 ? 
					this.getLastName().compareTo(s1.getLastName()) : 
						this.address.getZipcode().compareTo(s1.address.getZipcode());*/
			
			return this.address.compareTo(s.address) == 0 ?
					this.getLastName().compareTo(s.getLastName()) : 
						this.address.compareTo(s.address)
					;
			
		}

		



}
