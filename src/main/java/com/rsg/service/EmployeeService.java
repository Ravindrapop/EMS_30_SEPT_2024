package com.rsg.service;

import java.util.List;

import com.rsg.model.Employee;

public interface EmployeeService {
	
	public String createEmployee(Employee employee);
	
	public List<Employee> getAllEmployeeDetails();
	
	public String deleteEmployee(Integer id);

}
