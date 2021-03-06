package com.model;

import java.util.Set;

public class EmployeeModel {
	private String EmployeeName;
	private int EmployeeId;
	private Set<AddressModel> addresses;
	
	
	public Set<AddressModel> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<AddressModel> addresses) {
		this.addresses = addresses;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	
	public EmployeeModel(String employeeName, int employeeId) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
	}
	

}
