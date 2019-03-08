package JDBCApplication;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;


public class JdbcApp {

	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/test_database?useSSL=false";
	static final String USER_NAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		PreparedStatement prepared = null;
		CallableStatement callableStatement = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection established" + connection.isClosed());

			statement = connection.createStatement();
			
			// crreates table so we will run it 1 time only
			/*String sqlCreateTable = "CREATE TABLE EMPLOYEE("
					+ "ID INT NOT NULL PRIMARY KEY,"
					+ "NAME VARCHAR(100) NOT NULL" 
					+ ");";
			
			statement.execute(sqlCreateTable);
*/
			/*String sqlInsertTable = "INSERT INTO EMPLOYEE" + "(ID,NAME)" + "VALUE(1001,'JD')";
			statement.execute(sqlInsertTable);
*/
			
			/*String sqlInsertTable = "INSERT INTO EMPLOYEE" + "(ID,NAME)" + "VALUE(1003,'DJ')";
			statement.execute(sqlInsertTable);
			*/
			
			/*String sqlUpdate = "UPDATE EMPLOYEE SET NAME ='JIGAR' WHERE NAME = 'JD'";
			statement.executeUpdate(sqlUpdate);
			 */
			//there are two insert statemtns
			// instead we can have prepared statement
			
			
			//prepared statement
			
			String sqlPrepared = "INSERT INTO EMPLOYEE(ID,NAME) VALUE(?,?)";
			prepared = connection.prepareStatement(sqlPrepared);
			/*prepared.setInt(1, 1004);
			prepared.setString(2, "Adam");
			prepared.executeUpdate();
			
			prepared.setInt(1, 1005);
			prepared.setString(2, "Smith");
			prepared.executeUpdate();
			*/
/*			for(int i=6; i<=8 ; i++) {
				prepared.setInt(1, 1000+i);
				prepared.setString(2, "Smith");
				prepared.executeUpdate();
			}
*/			
			
			

			/*String sqlCallProcesure = "{call new_test_procedure(?,?)}";
			callableStatement = connection.prepareCall(sqlCallProcesure);
			callableStatement.setInt(1, 1009);
			callableStatement.setString(2, "Adm");
			callableStatement.executeUpdate();
			*/
			
			
			String sqlCallDelete = "{call new_procedure_delete()}";
			callableStatement = connection.prepareCall(sqlCallDelete);
			//callableStatement.getString("Smith");
			callableStatement.executeUpdate();
			
			
			
			
			String sqlGet = "SELECT * FROM EMPLOYEE";
			statement.executeQuery(sqlGet);

			ResultSet rs = statement.executeQuery(sqlGet);
			while (rs.next()) {
				System.out.println(rs.getInt("ID")+ " " + rs.getString("NAME"));
			}	
			
			
			
			
			/*
			
			
			
			
			
			
			String sqlDelete = "DELETE FROM EMPLOYEE WHERE NAME='1'";
			statement.execute(sqlDelete);

			ResultSet rs1 = statement.executeQuery(sqlGet);
			while (rs1.next()) {
				System.out.println("NAME =" + rs1.getString("NAME"));
			}
*/
			statement.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (prepared != null) {
			try {
				prepared.close();
			} catch (SQLException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			}
			
			
			if (callableStatement != null) {
			try {
				callableStatement.close();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			}
			
			
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
