package ro.management.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import ro.management.helpers.DBHelper;
import ro.management.pojo.Department;

public class DepartmentDAO {

	public static ArrayList<Department> listDepartments() throws SQLException{
		Connection conn = DBHelper.getConnection();
		String query = "SELECT * FROM departments";
		
		PreparedStatement ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Department> departments= new ArrayList<>();
		while(rs.next()) {
			Department u = new Department(rs.getInt("departmentID"), rs.getString("departmentName"), rs.getString("departmentDescription"));
			departments.add(u);
		}
		DBHelper.closeConnection();
		return departments;
	}
	
	
	// create a department
	
		public static void create(Department d) throws SQLException {
			DepartmentDAO.create(d.getDepartmentName(), d.getDepartmentDescription());
		}
		
		
		public static void create(String departmentName, String departmentDescription) throws SQLException {
			// instructiunea sql
			String insert = "insert into departments (departmentName, departmentDescription)" + "values(?,?)";

			// conexiune
			Connection con = DBHelper.getConnection();

			// prepared statement
			PreparedStatement stmt = con.prepareStatement(insert);
			stmt.setString(1, departmentName);
			stmt.setString(2, departmentDescription);

			// executie stmt
			stmt.executeUpdate();

			DBHelper.closeConnection();
		}

		
		public static Department getById(int id) throws SQLException,IOException  {
			Connection conn=DBHelper.getConnection();
			String query="select * from  departments where departmentID = ?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Department department =new Department(rs.getInt("departmentID"),
						rs.getString("departmentName"),
						rs.getString("departmentDescription"));
				DBHelper.closeConnection();
				return department;
			}
			DBHelper.closeConnection();
			return null;
				
		}
		

		public static void update(Department d) throws SQLException {

			String update = "update departments set departmentName=?, departmentDescription=? where departmentId=?";

			// conexiune
			Connection con = DBHelper.getConnection();

			// prepared statement
			PreparedStatement stmt = con.prepareStatement(update);
			stmt.setString(1, d.getDepartmentName());
			stmt.setString(2, d.getDepartmentDescription());
			stmt.setInt(3, d.getDepartmentId());

			// executie stmt
			stmt.executeUpdate();

			DBHelper.closeConnection();
		}
		
		public static void delete(Department d) throws SQLException {
			DepartmentDAO.delete(d.getDepartmentId());
		}

		public static void delete(int id) throws SQLException {
			String delete = "delete from departments where departmentID=?";
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
