package org.learn.java;

import org.hibernate.Session;
import org.learn.java.datasource.DataSource;
import org.learn.java.domain.Course;
import org.learn.java.domain.Student;

public class HibernateApplication {

	public static void main(String[] args) {
		Session session = DataSource.getSessionFactory().openSession();
		session.getTransaction().begin();

		// create a course
		Course course = new Course("Java");

		// save the course
		System.out.println("\nSaving the course ...");
		session.save(course);
		System.out.println("Saved the course: " + course);

		// create the students
		Student st1 = new Student("Jhon", "Doe", "jhon@gmail.com");
		Student st2 = new Student("Mary", "Public", "mary@gmail.com");

		// add students to the course
		course.addStudent(st1);
		course.addStudent(st2);

		// save the students
		System.out.println("\nSaving the students ...");
		session.save(st1);
		session.save(st2);
		System.out.println("Saved students: " + course.getStudents());

		session.getTransaction().commit();
		session.close();

		DataSource.closeSessionFactory();
	}

}
