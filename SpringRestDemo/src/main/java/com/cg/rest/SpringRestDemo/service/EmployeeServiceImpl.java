package com.cg.rest.SpringRestDemo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.SpringRestDemo.entity.Employee;
import com.cg.rest.SpringRestDemo.repository.Employeerepository;


@Service
public class EmployeeServiceImpl implements EmployeeService  {
	@Autowired
	private Employeerepository repository;
	
	@Autowired
	private Map<Integer, Employee> map = new HashMap<Integer, Employee>();

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public List<Employee> getAllAccounts() {
		
		return repository.findAll();
	}

	@Override
	public boolean deleteAccountById(int empId) {
		return map.remove(empId)!=null;
	}
}
