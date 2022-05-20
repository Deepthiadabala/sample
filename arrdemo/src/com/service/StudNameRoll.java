package com.service;

import com.model.Student;

public class StudNameRoll {
	
	public String studNameRoll(Student[] students, int id) {
		String naming=null;
		for (int i = 0; i < students.length; i++) {
			if (id == students[i].getStdroll()) {
				naming = students[i].getStdName();
			}
			
		}
		return naming;
		
	}

}
