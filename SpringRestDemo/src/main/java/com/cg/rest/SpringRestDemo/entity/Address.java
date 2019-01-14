package com.cg.rest.SpringRestDemo.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String flatNo;
	private String name;
	private String city;
	private String street;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", name=" + name + ", city=" + city + ", street=" + street + "]";
	}
	
}
