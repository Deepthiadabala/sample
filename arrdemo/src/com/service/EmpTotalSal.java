package com.service;

import com.model.Employee;

public class EmpTotalSal {
	
	public float totalSal(Employee [] employees) {
		float total = 0.0f;
		for (int i = 0; i < employees.length; i++) {
			total += employees[i].getSalary();
		}
		
		return total;
	}

}
