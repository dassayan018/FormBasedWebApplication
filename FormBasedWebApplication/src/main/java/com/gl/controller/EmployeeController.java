package com.gl.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.pojo.Employee;

@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/registrationForm")
	public String showRegistrationForm(Model theModel) {
		
		Employee employee = new Employee();
		theModel.addAttribute("employeeModel", employee);
		
		return "employee-form";
	}
	

}
