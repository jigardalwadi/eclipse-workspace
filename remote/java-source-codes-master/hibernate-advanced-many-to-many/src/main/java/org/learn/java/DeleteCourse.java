package org.learn.java;

import org.hibernate.Session;
import org.learn.java.datasource.DataSource;
import org.learn.java.domain.Course;

public class DeleteCourse {

	public static void main(String[] args) {
		Session session = DataSource.getSessionFactory().openSession();
		session.getTransaction().begin();

		// get the a particular course from db
		int courseId = 3;
		Course tempCourse = session.get(Course.class, courseId);

		// delete the course
		System.out.println("Deleting course: " + tempCourse);

		session.delete(tempCourse);

		session.getTransaction().commit();
		session.close();

		DataSource.closeSessionFactory();
	}
}
