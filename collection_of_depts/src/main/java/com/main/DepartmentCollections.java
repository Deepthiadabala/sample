package com.main;

import java.util.HashSet;
import java.util.Set;

import com.model.AddressModel;
import com.model.DepartmentModel;
import com.model.EmployeeModel;

public class DepartmentCollections {
	public static void main(String[] args) {
		DepartmentModel departmentModel = new DepartmentModel();
		
		
		//Creating Address set
		Set setAdresess = new HashSet();
		AddressModel address1 = new AddressModel("R.H.Colony", "Vizag");
		AddressModel address2 = new AddressModel("Kandhan", "chennai");
		setAdresess.add(address1);
		setAdresess.add(address2);
		
		//creating Employees set
		
		Set setEmployee = new HashSet();
		EmployeeModel employee1 = new EmployeeModel("Deepthi",120);
		EmployeeModel employee2 = new EmployeeModel("Jai Teja", 200);
		setEmployee.add(employee1);
		setEmployee.add(employee2);
		
		
	}

}
