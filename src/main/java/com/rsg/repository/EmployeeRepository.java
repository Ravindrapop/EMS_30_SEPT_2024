package com.rsg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsg.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
