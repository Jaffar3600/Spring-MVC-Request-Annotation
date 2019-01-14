package com.cg.rest.SpringRestDemo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.SpringRestDemo.entity.Employee;
import com.cg.rest.SpringRestDemo.service.EmployeeService;

@RestController
@RequestMapping("/employees") // addressable resource
public class EmployeeResource {
	@Autowired
	private EmployeeService service;

	@PostMapping // uniform constraint interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	@GetMapping // uniform constraint interface
	public List<Employee> getAllAccounts() {
		return service.getAllAccounts();
	}

	@DeleteMapping
	public boolean deleteAccount(@PathVariable int empId) {

		return service.deleteAccountById(empId);

	}
}
