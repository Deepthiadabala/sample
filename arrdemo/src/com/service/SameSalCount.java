package com.service;

import com.model.Employee;

public class SameSalCount {
	
	public int sameSalCount(Employee [] employees, float salary) {
		int c=0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() == salary) {
				c++;
			}
	}
		return c;

}
}
