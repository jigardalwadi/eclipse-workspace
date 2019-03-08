package org.learn.hibernate;

import org.learn.hibernate.dao.EmployeeDao;
import org.learn.hibernate.dao.impl.EmployeeDaoImpl;
import org.learn.hibernate.datasource.DataSource;
import org.learn.hibernate.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HibernateApplication {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(HibernateApplication.class);

		EmployeeDao employeeDao = new EmployeeDaoImpl();
		//List<Employee> employees = employeeDao.findAll();
		/*for(Employee e : employees) {
			System.out.println(e);
		}*/
		//System.out.println(employeeDao.findByEmployeeId(2));
		//Employee employee = new Employee("John Silver");
		//employeeDao.insert(employee);
		
		employeeDao.findAll().forEach(e -> logger.debug("Test:{}", e));
		
		//employeeDao.delete(3);
		DataSource.closeSessionFactory();

	}

}
