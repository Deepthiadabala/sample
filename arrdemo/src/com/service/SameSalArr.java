package com.service;

import com.model.Employee;

public class SameSalArr {
	public int[] sameSalArr(int c, Employee[] employees, float salary) {
		int[] arr = new int[c];
		int k = c-1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=0;
		}
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() == salary) {
				arr[k] = i;
				k--;
				
			}
		}
		return arr;
		
	}

}
