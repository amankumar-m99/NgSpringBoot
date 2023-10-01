package com.springboot.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBoot.entity.Employee;
import com.springboot.SpringBoot.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "home page of my app";
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.employeeService.getEmployees();
	}

	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable String employeeId) {
		return this.employeeService.getEmployee(Integer.parseInt(employeeId));
	}

	@PostMapping(path = "/employee", consumes = "application/json")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable String employeeId) {
		try {
			this.employeeService.deleteEmployee(Integer.parseInt(employeeId));
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
