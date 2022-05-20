package com.service;

import com.model.Department;
import com.model.Employee;

public class EmpNoDept {
	
	public String searchEmpNo(Department department1,int empNo1) {
		String name =null;
		Employee[] emp = department1.getEmployees();
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEmpNo() == empNo1) {
				name = emp[i].getEmpName();
			}
		}
		return name;
	}

}
