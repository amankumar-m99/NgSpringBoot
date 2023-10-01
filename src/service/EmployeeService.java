package com.springboot.SpringBoot.service;

import java.util.List;

import com.springboot.SpringBoot.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();

	Employee getEmployee(int employeeId);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int employeeId);
}
