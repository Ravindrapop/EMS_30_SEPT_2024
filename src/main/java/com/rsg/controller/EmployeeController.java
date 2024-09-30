package com.rsg.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsg.model.Employee;
import com.rsg.model.Student;


@RestController
public class EmployeeController {
	
	@PostMapping("createEmployee")
	public String createEmployee(@RequestBody Employee employee ) {
		System.out.println(employee);
		return "Employee profile has been create successfully!!!";
	}
	
	@RequestMapping("/studentinfo")
	public Student studentInfo() {
		
		return new Student(101,"Bharat");
		
	}
}
