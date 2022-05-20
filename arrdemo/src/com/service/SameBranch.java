package com.service;

import com.model.Student;

public class SameBranch {
	
	public int sameBranch(Student[] students, String brchName) {
		int count =0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getBranch() == brchName) {
				count++;
			}
		}
		
		return count;
	}

}
