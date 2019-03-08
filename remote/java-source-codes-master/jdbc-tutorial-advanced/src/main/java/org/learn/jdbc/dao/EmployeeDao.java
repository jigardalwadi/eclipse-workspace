package org.learn.jdbc.dao;

import java.util.List;

import org.learn.jdbc.domain.Employee;

public interface EmployeeDao {  //DAO stands for data acccess object
	
	public void insert(Employee employee);
	public void update(Employee employee);
	public Employee findByEmployeeId(Integer id);
	public List<Employee> findAll();
	public void delete(Integer id);

}
