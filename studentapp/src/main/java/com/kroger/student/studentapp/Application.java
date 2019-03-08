package com.kroger.student.studentapp;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student(101, "Jigar", "dalwadi", 3.5f);
		
		Student s2= new Student(202, "Yash", "Bhatt", 3.2f);
		
		Student s3= new Student(153, "John", "Smith", 3.5f);
		
		Student s4= new Student(405, "John", "wills", 2.5f);
		
		Student s5= new Student(562, "Will", "Smith", 3.1f);
		
		Student s6= new Student(025, "Josh", "Greens", 3.9f);

		String s = "Abc";
		System.out.println(s.hashCode());
		s = s+ "A";
		System.out.println(s.hashCode());
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb.hashCode());
		sb = sb.append("A");
		System.out.println(sb.hashCode());
		
		
		StringBuilder sb1 = new StringBuilder("abc");
		System.out.println(sb1.hashCode());
		sb1 = sb1.append("A");
		System.out.println(sb1.hashCode());
		
		
		
		Hashtable<String, Integer> gb = new Hashtable();
		HashMap<String, Integer> hm = new HashMap<>();
		
		List<Student> studentList = Arrays.asList(new Student[] {s1,s2,s3,s4,s5,s6}); 
		//Collections.sort(studentList);
		System.out.println(studentList);
		
		
		// sort method with two arg
		//1st is list and second is comparator which implements compare method
		Collections.sort(studentList, new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		// This can be writen as lambda like this....		
		Collections.sort(studentList, (x1,x2)-> x1.getId()-x2.getId());
		

		System.out.println(studentList);
		
		
		// using Lambda expression
		Collections.sort(studentList,(x1,x2)-> Float.compare(x1.getGpa(), x2.getGpa()));
		System.out.println(studentList);
		
		
	}
	

}
