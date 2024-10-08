package com.rsg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsg.model.Employee;
import com.rsg.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String createEmployee(Employee employee) {

		System.out.println("Employee Service Impl " + employee);
		
		employeeRepository.save(employee);
		
		return "Employee profile has been created successfully!!!";

	}
	
	@Override
	public List<Employee> getAllEmployeeDetails(){
		
		List<Employee> listEmployee = employeeRepository.findAll();
		
		return listEmployee;
	}
	
	@Override
	public String deleteEmployee(Integer id) {
		System.out.println("Employee Service Impl : "+id);
		
		employeeRepository.deleteById(id);
		
		return "Employee has been deleted successfully!!!";
	}

}
