package com.service;

import com.model.Department;
import com.model.Employee;

public class CountOfName {
	public int countOfName(Department department1,String str)  {
		Employee[] arr = department1.getEmployees();
		int c=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getEmpName() == str) {
				c++;
			}
		}
		return c;
	}

}
