package com.model;

public class PermanentEmployee extends Employee {

	@Override //
	public float calculateSalary() {
		
		return 2500.23f;
	}
	public void qualification() {
		System.out.println("Qualification : Degree");
	}

}
