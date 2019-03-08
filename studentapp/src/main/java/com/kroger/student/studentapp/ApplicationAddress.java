package com.kroger.student.studentapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationAddress {

	public static void main(String[] args) {
		
		Address a1 = new Address("MA",202);
		Student1 s1 = new Student1(101,"Jigar","Dalwadi",3.4f, a1);
		
		Address a2 = new Address("CA",401);
		Student1 s2 = new Student1(201,"Yash","Bhatt",3.1f, a2);
		
		Address a3 = new Address("AZ",202);
		Student1 s3 = new Student1(151,"Aoe","Amiths",3.0f, a3);
		
		Address a4 = new Address("NC",201);
		Student1 s4 = new Student1(205, "James", "Doe", 2.4f, a4);
		List<Student1> studentList = Arrays.asList(new Student1[] {s1,s2,s3,s4}); 
		
		/*System.out.println(studentList);
		Collections.sort(studentList);
		System.out.println("AFTER using Comparable");
		System.out.println(studentList);
		
*/
		Collections.sort(studentList, 
				(x1, x2) -> x1.getAddress().getZipcode()-x2.getAddress().getZipcode() == 0 ?
						x1.getFirstName().compareTo(x2.getFirstName()) : 
							x1.getAddress().getZipcode()-x2.getAddress().getZipcode()
						
				);
		
	//	System.out.println(studentList);
		
		
		
		Collections.sort(studentList, new Comparator<Student1>() {

			public int compare(Student1 o1, Student1 o2) {
				
				return o1.getAddress().compareTo(o2.getAddress()) == 0 ?
						o1.getLastName().compareTo(o2.getLastName()) : 
							o1.getAddress().compareTo(o2.getAddress());
			}
			
		});
		System.out.println(studentList);
		
		
			
		

	}
}


