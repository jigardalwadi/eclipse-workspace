package org.learn.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.learn.hibernate.datasource.DataSource;
import org.learn.hibernate.domain.Employee;
import org.learn.hibernate.domain.Store;

public class HibernateApplication {

	public static void main(String[] args) {
		
		Session session = DataSource.getSessionFactory().openSession();
		session.getTransaction().begin();
		
//		Store store = new Store("Walmart-BLACK", "College Park, MD");
//		Employee employee1 = new Employee("John Silver");
//		Employee employee2 = new Employee("David Blain");
//		
//		employee1.setStore(store);
//		employee2.setStore(store);
//		
//		List<Employee> epms = new ArrayList<>();
//		epms.add(employee1);
//		epms.add(employee2);
//		
//		store.setEmployees(epms);
//		
//		session.persist(store);
		//session.save(employee1);
		//session.save(employee2);
		
		/*List<Store> stores = session.createQuery("FROM Store", Store.class).getResultList();
		
		for(Store s : stores) {
			System.out.println(s.getName() + " \t" + s.getLocation());
		}*/
		/*Employee e = session.createQuery("FROM Employee where id=2", Employee.class).getSingleResult();
		System.out.println(e.getName() + "\t" + e.getStore().getName());*/
		
		/*List<Store> listOfStores = session.createNamedQuery("selectAll", Store.class).getResultList();
		
		for(Store s : listOfStores) {
			System.out.println(s.getName() + s.getLocation());
		}*/
		
		List<Store> ss = session.createNamedStoredProcedureQuery("selectAll").getResultList();
		/*StoredProcedureQuery query = session.createNamedStoredProcedureQuery("selectAll");
		query.set*/
		
		
		
		for(Store s : ss) {
			System.out.println(s.getName() + s.getLocation());
		}
		
		
		//StoredProcedureQuery query = session.createNamedQuery("selectAll", Store.class);
		
		
		
		session.getTransaction().commit();
		session.close();
		
		/*for(Store s : stores) {
			System.out.println(s.getName() + " \t" + s.getLocation());
			
			for(Employee e : s.getEmployees()) {
				System.out.println("\t" + e.getName());
			}
		}*/
		
		
		DataSource.closeSessionFactory();
	}

}
