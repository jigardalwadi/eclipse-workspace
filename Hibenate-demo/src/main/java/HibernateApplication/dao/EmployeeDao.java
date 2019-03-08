package HibernateApplication.dao;

import java.sql.SQLException;
import java.util.ArrayList;  
import java.util.List;

import HibernateApplication.domain.Employee;

public interface EmployeeDao {   // Dao is for data access object 

	public void insert(Employee e) throws ClassNotFoundException, SQLException;
	public void update(Employee e) throws ClassNotFoundException, SQLException;
	public Employee findByEmployeeId(Integer e);
	public void delete(Integer id);
	public List<Employee> findAll();
	
	
}
