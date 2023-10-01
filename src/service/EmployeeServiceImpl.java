package com.springboot.SpringBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.SpringBoot.dao.EmployeeDao;
import com.springboot.SpringBoot.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.getOne(employeeId);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		Employee employee = employeeDao.getOne(employeeId);
		employeeDao.delete(employee);
	}

}
