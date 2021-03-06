package com.model;

import java.util.Set;

public class Department {
private int deptId;
private String deptName;
//one to many
private Set<Address> address;


public Set getAddress() {
	return address;
}

public void setAddress(Set address) {
	this.address = address;
}

public Department() {
	super();
	
}

public int getDeptId() {
	return deptId;
}

public String getDeptName() {
	return deptName;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public Department(int deptId, String deptName) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
}

}
