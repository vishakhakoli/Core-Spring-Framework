package com.springframework.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("constructor");
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting method");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
