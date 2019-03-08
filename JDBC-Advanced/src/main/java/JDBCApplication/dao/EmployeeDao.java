package JDBCApplication.dao;

import java.sql.SQLException;
import java.util.ArrayList;  
import java.util.List;

import JDBCApplication.domain.Employee;

public interface EmployeeDao  {   // Dao is for data access object 

	public void insert(Employee e) throws ClassNotFoundException, SQLException;
	public void update() throws ClassNotFoundException, SQLException;
	public Employee findByEmployeeId(Employee e);
	public void delete(Integer id);
	public List<Employee> findAll();
	
	
}
