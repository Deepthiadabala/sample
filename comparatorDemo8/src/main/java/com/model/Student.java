package com.model;

public class Student {
	private int studentId;
	private String StudentName;
	private int StudentAge;
	private int mark;

	// POJO private variable+constructor+getter and setter

	public Student(int studentId, String studentName, int studentAge, int mark) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentAge = studentAge;
		this.mark = mark;
	}

	public Student() {
		super();

	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public int getStudentAge() {
		return StudentAge;
	}

	public int getMark() {
		return mark;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentAge=" + StudentAge
				+ ", mark=" + mark + "]";
	}

	/*
	 * @Override public String toString() {
	 * 
	 * return "Happy"; }
	 * 
	 */
	
	

}
