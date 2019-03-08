package org.learn.java;

import org.hibernate.Session;
import org.learn.java.datasource.DataSource;
import org.learn.java.domain.Course;
import org.learn.java.domain.Student;

public class DeleteStudent {
	public static void main(String[] args) {
		Session session = DataSource.getSessionFactory().openSession();
		session.getTransaction().begin();

		// get a particular student from db
		int studentId = 1;
		Student student = session.get(Student.class, studentId);

		// delete the student
		System.out.println("Deleting student: " + student);

		session.delete(student);

		session.getTransaction().commit();
		session.close();

		DataSource.closeSessionFactory();
	}
}
