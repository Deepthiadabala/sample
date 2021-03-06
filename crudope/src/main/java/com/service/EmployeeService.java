package com.service;

import com.model.Employee;

public interface EmployeeService {
	//create Emp Obj, read Emp Obj, update Emp Obj, delete Emp Obj,
	
	public abstract Employee createEmployee(Employee employee); // no body
	public abstract Employee readEmployeeById(int empId);
	public abstract Employee readEmployeeByName(String name);
	public abstract Employee updateEmployee(Employee employee);
	public abstract Employee deleteEmployeeById(int empId);
	public abstract Employee deleteEmployeeByName(String name);

}
