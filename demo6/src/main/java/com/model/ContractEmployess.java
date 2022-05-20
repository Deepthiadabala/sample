package com.model;

public class ContractEmployess extends Employee {

	@Override
	public float calculateSalary() {
		
		return 2000f;
	}
	public void qualification() {
		System.out.println("Qualification : Diploma");
	}

}
