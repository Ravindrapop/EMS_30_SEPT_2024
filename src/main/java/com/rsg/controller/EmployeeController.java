package com.rsg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.model.Employee;
import com.rsg.service.EmployeeService;


@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("createEmployee")
	public String createEmployee(@RequestBody Employee employee ) {
		System.out.println("Employee Controller "+employee);
		
		String message = employeeService.createEmployee(employee);
		
		return message;
	}
	
	
}
