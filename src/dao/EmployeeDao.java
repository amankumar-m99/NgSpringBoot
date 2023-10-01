package com.springboot.SpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringBoot.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{}
