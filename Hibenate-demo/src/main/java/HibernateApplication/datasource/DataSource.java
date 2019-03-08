package HibernateApplication.datasource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateApplication.domain.Employee;

public class DataSource {
	
		public static SessionFactory SessionFactory = null;
		
		public static SessionFactory getSessionFactory() {
			if(SessionFactory != null) {
				return SessionFactory;
			}
			else {
				Configuration config = new Configuration();
				config.addAnnotatedClass(Employee.class);
				SessionFactory = config.buildSessionFactory();
				return SessionFactory;
			}
		}
		
		public static void closSession() {
			if(SessionFactory != null) {
				SessionFactory.close();
			}
		}
		
}
