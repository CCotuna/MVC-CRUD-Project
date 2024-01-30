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

import ro.management.dao.DepartmentDAO;
import ro.management.pojo.Department;

@Controller
public class DepartmentController {
	
	@GetMapping("/departments")
	public ModelAndView listDepartments() throws SQLException {
		ModelAndView mav = new ModelAndView("department/listDepartments");
		
		ArrayList<Department> departments = DepartmentDAO.listDepartments();
		mav.addObject("departments", departments);
		
		for(Department department : departments) {
			System.out.println("Department Id: " + department.getDepartmentId());
			System.out.println("Department Name: " + department.getDepartmentName());
		}
		
		return mav;
	}
	
	@GetMapping("/departments/add")
	public ModelAndView departmentAddGet(Model model) throws SQLException, IOException {

		Department department = new Department();
		model.addAttribute("department", department);

		return new ModelAndView("department/createDepartment", "model", model);
	}

	@PostMapping("/departments/add")
	public ModelAndView departmentAddSave(@ModelAttribute("department") Department d, ModelMap model, BindingResult result) {

		try {
			DepartmentDAO.create(d);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return new ModelAndView("redirect:/departments");
	}
	
	
	@GetMapping("/departments/{id}")
	public ModelAndView departmentPageById(@PathVariable int id) throws SQLException, IOException {
		ModelAndView mav = new ModelAndView("department/departmentFile");
		// get the watch from db
		Department department = DepartmentDAO.getById(id);

		mav.addObject("department", department);

		return mav;
	}
	
	@GetMapping("/departments/edit/{id}")
	public ModelAndView departmentEditGet(Model model, @PathVariable int id) throws SQLException, IOException {

		Department department = DepartmentDAO.getById(id);
		model.addAttribute("department", department);

		return new ModelAndView("department/updateDepartment", "model", model);
	}

	@PostMapping("/departments/edit")
	public ModelAndView departmentEditSave(@ModelAttribute("department") Department d, ModelMap model, BindingResult result) {

		try {
			DepartmentDAO.update(d);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return new ModelAndView("redirect:/departments");
	}
	
	@GetMapping("/departments/delete/{id}")
	public ModelAndView departmentDelete(@PathVariable int id) throws SQLException, IOException {

		DepartmentDAO.delete(id);

		return new ModelAndView("redirect:/departments");
	}
}
