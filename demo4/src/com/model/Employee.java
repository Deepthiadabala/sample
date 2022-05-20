package com.model;

public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	
	// Constructor Overloading
	public Employee() {
		//To assign values we need Constructor
		//Non - Parameter Constructor
		empNo = 100;
		empName = "Bablu";
		salary = 1000.00f;
	}
	
	public Employee(int empNo, String empName, float salary) { // Parameter Constructor
		//To assign values we need Constructor
		// this keyword which differences b/n local variables and parameter variables. 
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	//Plain old java object -> POJO
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
