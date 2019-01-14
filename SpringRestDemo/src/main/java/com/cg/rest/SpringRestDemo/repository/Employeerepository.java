package com.cg.rest.SpringRestDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.SpringRestDemo.entity.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer> {
	
	
}
