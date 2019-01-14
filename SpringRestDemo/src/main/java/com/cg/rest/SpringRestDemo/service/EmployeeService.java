package com.cg.rest.SpringRestDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.rest.SpringRestDemo.entity.Employee;


public interface EmployeeService{
	 void addNewEmployee(Employee employee);
	 List<Employee> getAllAccounts();
	
	boolean deleteAccountById(int empId);
}