package ro.management.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;


import ro.management.helpers.DBHelper;
import ro.management.pojo.Employee;

public class EmployeeDAO {

	public static ArrayList<Employee> listEmployees() throws SQLException{
		Connection conn = DBHelper.getConnection();
		String query = "SELECT * FROM employees";
		
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			Employee u = new Employee(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("phoneNumber"), rs.getDate("registered").toLocalDate() , rs.getString("role"));
			employees.add(u);
		}
		DBHelper.closeConnection();
		return employees;
	}
	
	// create an employee
	
		public static void create(Employee e) throws SQLException {
			EmployeeDAO.create(e.getFirstname(),e.getLastname(), e.getPhoneNumber(), e.getRegistered() ,e.getRole());
		}
		
		
		public static void create(String firstname, String lastname, String phoneNumber, LocalDate registered, String role) throws SQLException {
			// instructiunea sql
			String insert = "insert into employees (firstname, lastname, phoneNumber, registered, role)" + "value(?,?,?,?,?)";

			// conexiune
			Connection con = DBHelper.getConnection();

			// prepared statement
			PreparedStatement stmt = con.prepareStatement(insert);
			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			stmt.setString(3, phoneNumber);
			stmt.setDate(4, Date.valueOf(registered));
			stmt.setString(5, role);

			// executie stmt
			stmt.executeUpdate();

			DBHelper.closeConnection();
		}
		
		public static Employee getById(int id) throws SQLException,IOException  {
			Connection conn=DBHelper.getConnection();
			String query="select * from employees where id = ?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Employee employee =new Employee(rs.getInt("id"),
						rs.getString("firstname"),
						rs.getString("lastname"),
						rs.getString("phoneNumber"),
						rs.getDate("registered").toLocalDate(),
						rs.getString("role"));
				DBHelper.closeConnection();
				return employee;
			}
			DBHelper.closeConnection();
			return null;
				
		}
		
		public static void update(Employee e) throws SQLException {

			String update = "update employees set firstname=?, lastname=?, phoneNumber=? where id=?";

			// conexiune
			Connection con = DBHelper.getConnection();

			// prepared statement
			PreparedStatement stmt = con.prepareStatement(update);
			stmt.setString(1, e.getFirstname());
			stmt.setString(2, e.getLastname());
			stmt.setString(3, e.getPhoneNumber());
			stmt.setInt(4, e.getId());
			// executie stmt
			stmt.executeUpdate();

			DBHelper.closeConnection();
		}
	
		public static void delete(Employee e) throws SQLException {
			EmployeeDAO.delete(e.getId());
		}

		public static void delete(int id) throws SQLException {
			String delete = "delete from employees where id=?";
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
