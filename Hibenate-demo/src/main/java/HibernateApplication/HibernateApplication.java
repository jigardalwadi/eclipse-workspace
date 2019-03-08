 package HibernateApplication;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateApplication.dao.EmployeeDao;
import HibernateApplication.dao.implementation.EmployeeDaoImpl;
import HibernateApplication.datasource.DataSource;
import HibernateApplication.domain.Employee;

public class HibernateApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {	
		
			
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		
		List<Employee> list = employeeDao.findAll();
		for(Employee e: list) {
			System.out.println(e);
		}

		
		System.out.println(employeeDao.findByEmployeeId(101));
		
		Employee e = new Employee(103,"JD");
		employeeDao.insert(e);
		//System.out.println(employeeDao.findByEmployeeId(103));
		DataSource.closSession();
		
	}
 
}
