package org.learn.java;

import org.hibernate.Session;
import org.learn.java.datasource.DataSource;
import org.learn.java.domain.Course;
import org.learn.java.domain.Student;

public class AddCourses {

	public static void main(String[] args) {
		Session session = DataSource.getSessionFactory().openSession();
		session.getTransaction().begin();

		// get the particular student from database
		int studentId = 2;
		Student Student = session.get(Student.class, studentId);

		System.out.println("\nLoaded student: " + Student);
		System.out.println("Courses: " + Student.getCourses());

		// create more courses
		Course Course1 = new Course("IOS");
		Course Course2 = new Course("Android");

		// add student to courses
		Course1.addStudent(Student);
		Course2.addStudent(Student);

		// save the courses
		System.out.println("\nSaving the courses ...");

		session.save(Course1);
		session.save(Course2);

		session.getTransaction().commit();
		session.close();

		DataSource.closeSessionFactory();
	}
}
