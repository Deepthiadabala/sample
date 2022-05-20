package com.model;

public class Employee {
	private int empId;
	private String Name;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return Name;
	}
	public float getSalary() {
		return salary;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		Name = name;
		this.salary = salary;
	}
	
	

}
