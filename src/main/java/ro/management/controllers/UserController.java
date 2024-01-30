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

import ro.management.dao.UserDAO;
import ro.management.pojo.User;

@Controller
public class UserController {
		
	@GetMapping("/users")
	public ModelAndView listUsers() throws SQLException {
		ModelAndView mav = new ModelAndView("user/listUsers");
		
		ArrayList<User> users = UserDAO.listUsers();
		mav.addObject("users", users);
		
		for(User user : users) {
			System.out.println("UserID: " + user.getId());
			System.out.println("Username: " + user.getUsername());
			System.out.println("Password: " + user.getPassword());
			System.out.println("Role: " + user.getRole());
		}
		
		return mav;
	}
	
	@GetMapping("/users/add")
	public ModelAndView usersAddGet(Model model) throws SQLException, IOException {

		User user = new User();
		model.addAttribute("user", user);

		return new ModelAndView("user/createUser", "model", model);
	}

	@PostMapping("/users/add")
	public ModelAndView watchAddSave(@ModelAttribute("user") User u, ModelMap model, BindingResult result) {

		try {
			UserDAO.create(u);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/users");
	}
	
	@GetMapping("/users/{id}")
	public ModelAndView userPageById(@PathVariable int id) throws SQLException, IOException {
		ModelAndView mav = new ModelAndView("user/userFile");
		// get the watch from db
		User user = UserDAO.getById(id);

		mav.addObject("user", user);

		return mav;
	}
	
	@GetMapping("/users/edit/{id}")
	public ModelAndView userEditGet(Model model, @PathVariable int id) throws SQLException, IOException {

		User user = UserDAO.getById(id);
		model.addAttribute("user", user);

		return new ModelAndView("user/updateUser", "model", model);
	}

	@PostMapping("/users/edit")
	public ModelAndView userEditSave(@ModelAttribute("user") User u, ModelMap model, BindingResult result) {

		try {
			UserDAO.update(u);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/users");
	}
	
	@GetMapping("/users/delete/{id}")
	public ModelAndView userDelete(@PathVariable int id) throws SQLException, IOException {

		UserDAO.delete(id);

		return new ModelAndView("redirect:/users");
	}
}
