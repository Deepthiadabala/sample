package com.service;


import com.model.Employee;

public class BusinessLogic {
	
	public boolean  searchById(Employee[] employees, int id) {
		boolean bool =false;
		 for (int i = 0; i < employees.length; i++) {
			 if (employees[i].getEmpNo() == id) {
				bool = true;
			 }
		}
		
		return bool;
		
	}

}
