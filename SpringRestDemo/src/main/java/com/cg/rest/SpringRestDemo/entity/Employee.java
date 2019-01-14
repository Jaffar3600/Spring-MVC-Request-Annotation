package com.cg.rest.SpringRestDemo.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private double salary;
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Embedded
	private Address address;
	public int getEmpId() {
		return empId;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
}
