package com.dependencyinjection.namespace.p.beans;

public class Employee2 {
	private String empName;
	 private String empId;
	 private String empAddress;
	 private int salary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = (int) salary;
	}
	@Override
	public String toString() {
		return "Employee2 [empName=" + empName + ", empId=" + empId + ", empAddress=" + empAddress + ", salary="
				+ salary + "]";
	}
	 
	 
	 
}
