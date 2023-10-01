package com.springboot.SpringBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.SpringBoot.entity.Employee;

@Service
public class EmployeeServiceImplApi {//implements EmployeeService {

	List<Employee> employees;

	public EmployeeServiceImplApi() {
		employees = new ArrayList<>();
		employees.add(new Employee(101,"Stephen", "USA"));
		employees.add(new Employee(201,"Damon", "USA"));
		employees.add(new Employee(301,"Elena", "UK"));
		employees.add(new Employee(401,"Enzo", "Australiya"));
		employees.add(new Employee(501,"Sundar", "India"));
		employees.add(new Employee(502,"Stya", "Sri Lanka"));
		employees.add(new Employee(564,"Hussain", "India"));
	}

//	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

//	@Override
	public Employee getEmployee(int id) {
		for(Employee employee: employees) {
			if(employee.getId() == id)
				return employee;
		}
		return null;
	}

//	@Override
	public Employee addEmployee(Employee employee) {
		employees.add(employee);
		return null;
	}

//	@Override
	public Employee updateEmployee(Employee employee) {
		for(Employee individualEmployee: employees){
			if(individualEmployee.getId() == employee.getId()) {
				individualEmployee.setName(employee.getName());
				individualEmployee.setCountry(employee.getCountry());
				return individualEmployee;
			}
		}
		return null;
	}

//	@Override
	public Employee deleteEmployee(int employeeId) {
		for(Employee individualEmployee: employees){
			if(individualEmployee.getId() == employeeId) {
				employees.remove(individualEmployee);
				return individualEmployee;
			}
		}
		return null;
	}

}
