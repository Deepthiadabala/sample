package com.model;

public class StudentModel {
	private String stdName;
	private int stdNo;
	private String teacherName;
	
	public StudentModel(String stdName, int stdNo, String teacherName) {
		this.stdName = stdName;
		this.teacherName=teacherName;
		this.stdNo=stdNo;
	}
	
	
	// Getters and Setters
	public String getStdName() {
		return stdName;
	}
	public int getStdNo() {
		return stdNo;
	}
	public String getteacherName() {
		return teacherName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public void setDept(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
}
