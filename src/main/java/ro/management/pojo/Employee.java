package ro.management.pojo;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {
	
	private int id;
	private String firstname;
	private String lastname;
	private String phoneNumber;
	private LocalDate registered;
	private String role;

	
	public Employee(int id, String firstname, String lastname, String phoneNumber, LocalDate registered, String role) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.registered = registered;
		this.role = role;
	}


	public Employee() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public LocalDate getRegistered() {
		return registered;
	}


	public void setRegistered(LocalDate registered) {
		this.registered = registered;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
}
