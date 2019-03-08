package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
	
	static {
		
	}

	public static void main(String[] args) {
			
		//TODO: create a list of students (may be five items)
		Address address1Mailing = new Address(101, "Baker's Street"," " ,"London","UK", 1011);
		Address address1Permanent = new Address(101, "Baker's Street"," Linkin Park" ,"London","UK", 1011);
		Student student1 = new Student("Jigar", "Dalwadi", address1Mailing, address1Permanent);
		
		Address address2Mailing = new Address(102, "Baker's Street"," " , "London","UK", 1010);
		Address address2Permanent = new Address(102, "Baker's Street","Eminem" ,"London","UK", 1010);
		Student student2 = new Student("Yash", "Bhatt", address2Mailing, address2Permanent);
		
		Address address3Mailing = new Address(103, "Baker's Street"," " , "London","UK", 1005);
		Address address3Permanent = new Address(103, "Baker's Street","Coldplay" ,"London","UK", 1005);
		Student student3 = new Student("John", "Doe", address3Mailing, address3Permanent);
		
		
		Address address4Mailing = new Address(104, "Baker's Street"," " , "London","UK", 1015);
		Address address4Permanent = new Address(104, "Baker's Street"," Khalib" ,"London","UK", 1015);
		Student student4 = new Student("Masood", "Habib", address4Mailing, address4Permanent);
		
		
		Address address5Mailing = new Address(105, "Baker's Street"," " , "London","UK", 1001);
		Address address5Permanent = new Address(105, "Baker's Street","Magic" ,"London","UK", 1001);
		Student student5 = new Student("Adam", "Doe", address5Mailing, address5Permanent);
		
		
		
		
		List<Student> listOFStudent = new ArrayList<Student>();
		listOFStudent.add(student1);
		listOFStudent.add(student2);
		listOFStudent.add(student3);
		listOFStudent.add(student4);
		listOFStudent.add(student5);
		listOFStudent.add(student5);
		
		
		/*for(Student s : listOFStudent) {
			System.out.println(s);
		}*/
		
		
		//TODO: sort the list using last name of the student
		
		Collections.sort(listOFStudent, 
				(x1, x2) -> x1.getLastName().compareTo(x2.getLastName()) == 0 ?
						x1.getFirstName().compareTo(x2.getFirstName()) : 
							x1.getLastName().compareTo(x2.getLastName())
						
				);
		/*System.out.println(" ");
		for(Student s : listOFStudent) {
			System.out.println(s);
		}*/
		
		
		
		//TODO: sort the list using the zip code of the mailing address
		
		/*
		Collections.sort(listOFStudent, 
				(x1,x2) -> x1.getMailingAddress().getZipcode()-x2.getMailingAddress().getZipcode()
				);*/
		
		/*Collections.sort(listOFStudent, 
				(x1,x2) -> x1.getMailingAddress().getZipcode()-x2.getMailingAddress().getZipcode() == 0 ?
						x1.getFirstName().compareTo(x2.getFirstName()) : 
							x1.getMailingAddress().getZipcode()-x2.getMailingAddress().getZipcode()
						
				);*/
		
		Collections.sort(listOFStudent, new Comparator<Student>() {

			public int compare(Student o1, Student o2) {
				
				return o1.getMailingAddress().getZipcode()- o2.getMailingAddress().getZipcode() == 0 ?
						o1.getLastName().compareTo(o2.getLastName()) : 
							o1.getMailingAddress().getZipcode()- o2.getMailingAddress().getZipcode();
			}
		});
		
		
		/*System.out.println(" ");
		for(Student s : listOFStudent) {
			System.out.println(s);
		}*/
		
		
		//TODO: find a student(s) by the last name which contain a given string
		
		
		String word= "Dal";
		
		List<Student> list2 = listOFStudent
				.stream()
				//.parallelStream()
				.filter(x->x.getLastName().contains(word))
				.collect(Collectors.toList());
		
		/*System.out.println(" ");
		for(Student s : list2) {
			System.out.println(s);
		}*/
		
		
		//TODO: create a set of students (may be five items) where unique student should be defined by their
		//1)last name, //2)first name and //3)permanent address
		
		Set<Student> setOfStudent = new HashSet<Student>();
		
		Map<String,Student> mapOfStudent = new HashMap<>();
		
		for(Student s: listOFStudent) {
			String k = s.getFirstName()+s.getLastName()+s.getPermanentAddress();
			if(!mapOfStudent.containsKey(k)) {
				mapOfStudent.put(k, s);
			}
		}
		
		
		System.out.println("set");
		Iterator it = mapOfStudent.entrySet().iterator();
		while(it.hasNext()) {
			 Map.Entry pair = (Map.Entry)it.next();
		        setOfStudent.add((Student) pair.getValue());
			 	//System.out.println(pair.getValue());
		        
		     //   it.remove(); // avoids a ConcurrentModificationException
		}
		
		/*System.out.println(" ");
		for(Student s : setOfStudent) {
			System.out.println(s);
		}*/
		
		Set<Student> setStudent = new HashSet<Student>(setOfStudent);
		
		Iterator<Student> StudentIterator = setStudent.iterator();
		while(StudentIterator.hasNext()) {
			Student student = StudentIterator.next();
			StudentIterator.remove();
			System.out.println("one");
		}
		
		
		
		//TODO: remove all of the addresses (may be set it to null) of all students and return them in a list
		
		List<Student> deleteAddress = new ArrayList<>();
		for(Student s: setOfStudent) {
			Address a = new Address(0, null, null, null, 0);
			Student temp = new Student(s.getFirstName(), s.getLastName(), a, a);
			deleteAddress.add(temp);
		}
		
		System.out.println("deleted one");
		for(Student s : deleteAddress) {
			System.out.println(s);
		}
		
		
	}

}
