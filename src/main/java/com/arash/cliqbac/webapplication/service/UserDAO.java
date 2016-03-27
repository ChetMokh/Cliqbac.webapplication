package com.arash.cliqbac.webapplication.service;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.arash.cliqbac.webapplication.model.*;

public class UserDAO {
	
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:5432:wiseR3B3L";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "zigil1";

	@SuppressWarnings("null")
	List<User> findAll() throws SQLException {
		String selectTableSQL = "SELECT * from users";
		Connection dbConnection = null;
		java.sql.Statement statement = dbConnection.createStatement();
		ResultSet rs = statement.executeQuery(selectTableSQL);
		int counter = 1;
		while (rs.next()) {
			System.out.println(counter);
			System.out.println(rs.getInt("userid"));
			System.out.println(rs.getString("username"));
			System.out.println("---------");
			counter++;
		}
		return null;
	}
    List<User> findById() {
    	
		return null;
	}
    List<User> findByName() {
    	
		return null;
	}
    
    boolean insertEmployee(User user) {
		
    	return false;
	}
    boolean updateEmployee(User use) {
		
    	return false;
	}
    boolean deleteEmployee(User use) {
    	
		return false;
	}
    
}
