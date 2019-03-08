package JDBCApplication;

import java.sql.SQLException;

import JDBCApplication.dao.EmployeeDao;
import JDBCApplication.dao.implementation.EmployeeDaoImpl;
import JDBCApplication.domain.Employee;

public class JdbcApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Employee employee = new Employee(1012,"John");
		EmployeeDao employeedao = new EmployeeDaoImpl();
		//employeedao.insert(employee);
		employeedao.update();
		
		
	}
}
