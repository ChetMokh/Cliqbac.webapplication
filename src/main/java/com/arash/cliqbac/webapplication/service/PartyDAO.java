package com.arash.cliqbac.webapplication.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arash.cliqbac.webapplication.model.*;

@Path("/parties")
public class PartyDAO {
	
	private Connection connection;
	
	public PartyDAO () {
		
	}
	
	public void getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		DriverManager.registerDriver(new org.postgresql.Driver());
		connection = DriverManager.getConnection(
				"jdbc:postgresql://127.0.0.1:5432/wiseR3B3L", "postgres",
				"zigil1");
		
	}
	
	@SuppressWarnings("null")
	public List<Party> findAll() throws SQLException, ClassNotFoundException {

		List<Party> myParties = new ArrayList<Party>();
		String selectTableSQL = "SELECT * from parties";
		java.sql.Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(selectTableSQL);

//		userid, address, partynotes, partyname
		
		while (rs.next()) {
			int userId = rs.getInt("userid");
			int partyId = rs.getInt("partyid");
			String address = rs.getString("address");
			String partynotes = rs.getString("partynotes");
			String partyname = rs.getString("partyname");
			String modTime = rs.getString("modtime");
			myParties.add(new Party(partyId, userId, address, partynotes, partyname));
		}
		return myParties;
	}
	
	
    public List<Party> findPartyByUserId(int userId) throws SQLException {
    	
    	List<Party> myParties = new ArrayList<Party>();
		String selectTableSQL = "SELECT * from parties where userid = "+ userId +" ";
		java.sql.Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(selectTableSQL);
		
		while (rs.next()) {
			userId = rs.getInt("userid");
			int partyId = rs.getInt("partyid");
			String address = rs.getString("address");
			String partynotes = rs.getString("partynotes");
			String partyname = rs.getString("partyname");
			String modTime = rs.getString("modtime");
			myParties.add(new Party(partyId, userId, address, partynotes, partyname));
		}
		return myParties;
    	
	}
    
public List<Party> findPartyByPartyId(int partyId) throws SQLException {
    	
    	List<Party> myParties = new ArrayList<Party>();
		String selectTableSQL = "SELECT * from parties where partyid = "+ partyId +" ";
		java.sql.Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(selectTableSQL);
		
		while (rs.next()) {
			int userId = rs.getInt("userid");
			partyId = rs.getInt("partyid");
			String address = rs.getString("address");
			String partynotes = rs.getString("partynotes");
			String partyname = rs.getString("partyname");
			String modTime = rs.getString("modtime");
			myParties.add(new Party(partyId, userId, address, partynotes, partyname));
		}
		return myParties;
    	
	}
    
public boolean createParty(Party party) throws SQLException {
	
	String selectTableSQL = "INSERT INTO parties (userid, partyname) "
			+ "VALUES ("+ party.getPartyOwner() +", '"+ party.getPartyName() +"')";
	java.sql.Statement statement = connection.createStatement();
//	statement.execute(selectTableSQL);
	statement.executeQuery(selectTableSQL);
	return true;
	
	}
    
//    public List<User> findByName(String userName) throws SQLException {
//    	
//    	List<User> myUser = new ArrayList<User>();
//		String selectTableSQL = "SELECT * from users where username = '"+ userName +"' ";
//		java.sql.Statement statement = connection.createStatement();
//		ResultSet rs = statement.executeQuery(selectTableSQL);
//		
//		while (rs.next()) {
//			int userId = rs.getInt("userid");
//			userName = rs.getString("username");
//			String phoneNumber = rs.getString("phonenumber");
//			String userPic = rs.getString("userpicture");
//			String realName = rs.getString("realname");
//			String modTime = rs.getString("modtime");
//			myUser.add(new User(userId, userName, phoneNumber, realName));
//		}
//		return myUser;
//		
//	}
//    
//    public boolean insertUser(User user) throws SQLException {
//		
//		String selectTableSQL = "INSERT INTO users (username, phonenumber, realname) "
//				+ "VALUES ('"+ user.getUserName() +"', '"+ user.getPhoneNumber() +"',"
//						+ " '"+ user.getRealName() +"')";
//		java.sql.Statement statement = connection.createStatement();
//		statement.executeUpdate(selectTableSQL);
//		return true;
//
//	}
//    
//    public boolean updateUser(User user) throws SQLException {
//		
//    	String selectTableSQL = "update users set (username, phonenumber, realname) "
//				+ "= ('"+ user.getUserName() +"', '"+ user.getPhoneNumber() +"',"
//						+ " '"+ user.getRealName() +"') "
//								+ "where userid = '"+ user.getUserId() +"'";
//		java.sql.Statement statement = connection.createStatement();
//		statement.executeUpdate(selectTableSQL);
//		return true;
//		
//	}
//    
//    
//    boolean deleteUser(User use) {
//		
//    	return false;
//    	
//	}
    
}
