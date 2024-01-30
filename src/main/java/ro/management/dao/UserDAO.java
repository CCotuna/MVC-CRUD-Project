package ro.management.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import ro.management.helpers.DBHelper;
import ro.management.pojo.User;

public class UserDAO {
	
	// display all the users
	public static ArrayList<User> listUsers() throws SQLException{
		Connection conn = DBHelper.getConnection();
		String query = "SELECT * FROM users";
		
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<User> users= new ArrayList<>();
		while(rs.next()) {
			User u = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("role"));
			users.add(u);
		}
		DBHelper.closeConnection();
		return users;
	}
	
	
	// create a user
	
	public static void create(User u) throws SQLException {
		UserDAO.create(u.getUsername(),u.getPassword(), u.getRole());
	}
	
	
	public static void create(String username, String password, String role) throws SQLException {
		// instructiunea sql
		String insert = "insert into users (username, password, role)" + "value(?,?,?)";

		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(insert);
		stmt.setString(1, username);
		stmt.setString(2, password);
		stmt.setString(3, role);

		// executie stmt
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}
	
	public static User getById(int id) throws SQLException,IOException  {
		Connection conn=DBHelper.getConnection();
		String query="select * from users where id = ?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			User user =new User(rs.getInt("id"),
					rs.getString("username"),
					rs.getString("password"),
					rs.getString("role"));
			DBHelper.closeConnection();
			return user;
		}
		DBHelper.closeConnection();
		return null;
			
	}
	
	public static void update(User u) throws SQLException {

		String update = "update users set username=?, password=? where id=?";

		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(update);
		stmt.setString(1, u.getUsername());
		stmt.setString(2, u.getPassword());
		stmt.setInt(3, u.getId());

		// executie stmt
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}
	
	public static void delete(User u) throws SQLException {
		UserDAO.delete(u.getId());
	}

	public static void delete(int id) throws SQLException {
		String delete = "delete from users where id=?";
		// conexiune
		Connection con = DBHelper.getConnection();

		// prepared statement
		PreparedStatement stmt = con.prepareStatement(delete);
		stmt.setInt(1, id);

		// executie stmt
		stmt.executeUpdate();

		DBHelper.closeConnection();
	}
}
