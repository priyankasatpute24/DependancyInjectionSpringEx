package com.dependencyinjection.ConstructorwithdependetObject;

public class Employee1 {

	private int id;
	private String name;
	private Address address;
	public Employee1(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void show() {
		System.out.println("Employeeid :"+id);
		System.out.println("Employeename :"+name);
		System.out.println("Employeeaddress:"+address);
		
	}
}
