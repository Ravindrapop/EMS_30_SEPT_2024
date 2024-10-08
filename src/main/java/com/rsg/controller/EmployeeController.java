package com.rsg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.model.Employee;
import com.rsg.service.EmployeeService;


@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	//http://localhost:8089/mainstay/createEmployee
	
	@PostMapping("createEmployee")
	public String createEmployee(@RequestBody Employee employee ) {
		System.out.println("Employee Controller "+employee);
		
		String message = employeeService.createEmployee(employee);
		
		return message;
	}
	
	@GetMapping("getAllEmployees")
	public List<Employee> getAllEmployeeDetails(){
		
		List<Employee> listEmployee = employeeService.getAllEmployeeDetails();
		
		
		return listEmployee;
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		
		System.out.println(id);
		
		String message = employeeService.deleteEmployee(id);
		
		return message;
	}
	
	
}
