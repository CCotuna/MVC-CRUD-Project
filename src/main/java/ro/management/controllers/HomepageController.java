package ro.management.controllers;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ro.management.dao.DepartmentDAO;
import ro.management.dao.EmployeeDAO;
import ro.management.dao.UserDAO;
import ro.management.pojo.Department;
import ro.management.pojo.Employee;
import ro.management.pojo.User;

@Controller
public class HomepageController {
	
	@GetMapping("/")
	public ModelAndView homepage() throws SQLException {
		ModelAndView mav = new ModelAndView("homepage");
		
		ArrayList<User> users = UserDAO.listUsers();
		ArrayList<Employee> employees = EmployeeDAO.listEmployees();
		ArrayList<Department> departments = DepartmentDAO.listDepartments();

		
		mav.addObject("users", users);
		mav.addObject("employees", employees);
		mav.addObject("departments", departments);
		return mav;
	}
}
