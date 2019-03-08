package JDBCApplication.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import JDBCApplication.domain.Employee;
import JDBCApplication.dao.EmployeeDao;
import static JDBCApplication.datasource.JdbcDataSource.getConnection;

public class EmployeeDaoImpl implements JDBCApplication.dao.EmployeeDao{

	private static String preParedStatement = "INSERT INTO EMPLOYEE(ID,NAME) VALUE(?,?) ";
	
	public void insert(Employee e) throws ClassNotFoundException, SQLException{
		
		Connection connection = getConnection();
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(preParedStatement);
			preparedStatement.setInt(1, e.getId());
			preparedStatement.setString(2, e.getName());
			preparedStatement.executeUpdate();
			
			
		}
		finally {
				if(connection != null) {
					connection.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
			
		}
		
		
	}

	public void update() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		Statement statement = null;
		statement = connection.createStatement();
		String updateStatement = "UPDATE EMPLOYEE SET NAME ='JIGAR' WHERE ID = 1011";
		statement.executeUpdate(updateStatement);
	}

	public Employee findByEmployeeId(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
