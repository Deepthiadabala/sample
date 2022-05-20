package com.model;

public class Employee implements Comparable<Employee>{
	private int empNo;
	private String EmpName;
	private int age;
	private int salary;

	public Employee(int empNo, String empName, int age, int salary) {
		super();
		this.empNo = empNo;
		EmpName = empName;
		this.age = age;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return EmpName;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (age == o.age)
			return 0;
		else if(age>o.age)
			return 1;
		else
			return -1;
	}

	
}
