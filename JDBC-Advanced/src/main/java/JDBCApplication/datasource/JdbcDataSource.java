package JDBCApplication.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDataSource {
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/test_database?useSSL=false";
	static final String USER_NAME = "root";
	static final String PASSWORD = "root";

	public static final Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection connection = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName(DRIVER);
		
		connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		return connection;
	}
		

}