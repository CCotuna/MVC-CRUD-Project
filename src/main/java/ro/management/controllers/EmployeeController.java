package ro.management.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ro.management.dao.EmployeeDAO;
import ro.management.pojo.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/employees")
	public ModelAndView listEmployees() throws SQLException {
		ModelAndView mav = new ModelAndView("employee/listEmployees");
		
		ArrayList<Employee> employees = EmployeeDAO.listEmployees();
		mav.addObject("employees", employees);
		
		for(Employee employee : employees) {
			System.out.println("Employee Id: " + employee.getId());
			System.out.println("Employee Name: " + employee.getFirstname());
		}
		
		return mav;
	}
	

	@GetMapping("/employees/add")
	public ModelAndView employeeAddGet(Model model) throws SQLException, IOException {

		Employee employee = new Employee();
		model.addAttribute("employee", employee);

		return new ModelAndView("employee/createEmployee", "model", model);
	}

	@PostMapping("/employees/add")
	public ModelAndView employeeAddSave(@ModelAttribute("employee") Employee e, ModelMap model, BindingResult result) {

		try {
			EmployeeDAO.create(e);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return new ModelAndView("redirect:/employees");
	}
	
	@GetMapping("/employees/{id}")
	public ModelAndView employeePageById(@PathVariable int id) throws SQLException, IOException {
		ModelAndView mav = new ModelAndView("employee/employeeFile");
		// get the watch from db
		Employee employee = EmployeeDAO.getById(id);

		mav.addObject("employee", employee);

		return mav;
	}
	
	@GetMapping("/employees/edit/{id}")
	public ModelAndView employeeEditGet(Model model, @PathVariable int id) throws SQLException, IOException {

		Employee employee = EmployeeDAO.getById(id);
		model.addAttribute("employee", employee);

		return new ModelAndView("employee/updateEmployee", "model", model);
	}

	@PostMapping("/employees/edit")
	public ModelAndView employeeEditSave(@ModelAttribute("employee") Employee e, ModelMap model, BindingResult result) {

		try {
			EmployeeDAO.update(e);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return new ModelAndView("redirect:/employees");
	}
	
	@GetMapping("/employees/delete/{id}")
	public ModelAndView employeeDelete(@PathVariable int id) throws SQLException, IOException {

		EmployeeDAO.delete(id);

		return new ModelAndView("redirect:/employees");
	}
}
