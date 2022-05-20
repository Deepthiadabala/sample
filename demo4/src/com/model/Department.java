package com.model;

public class Department {
	private int deptId;
	private String  deptName;
	private Employee[] employees; // creating relationship with Employee class
	
	// getters and setters
	
	
	
	public int getDeptId() {
		return deptId;
	}
	
	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
