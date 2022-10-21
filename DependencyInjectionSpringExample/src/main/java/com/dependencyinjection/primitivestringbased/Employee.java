package com.dependencyinjection.primitivestringbased;

public class Employee {
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	public Employee(int id) {
		super();
		this.id = id;
	}
	public void show() {
		System.out.println("Employeeid :"+id);
		System.out.println("Employeename :"+name);
	}
	
}
