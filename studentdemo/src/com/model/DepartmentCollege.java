package com.model;

public class DepartmentCollege {
	private int deptId;
	private String deptName;
	private StudentModel [] studentDet;
	
	public  DepartmentCollege(int deptId, String deptName, StudentModel[] studentDet) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.studentDet= studentDet;
		
	}
	
	public StudentModel[] getStudentDet() {
		return studentDet;
	}
	public void setStudentDet(StudentModel[] studentDet) {
		this.studentDet = studentDet;
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
	
	

}
