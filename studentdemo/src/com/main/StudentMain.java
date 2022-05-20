package com.main;

import com.model.DepartmentCollege;
import com.model.StudentModel;

public class StudentMain {
	public static void main(String[] args) {
		StudentModel stuDetails1 = new StudentModel("Deepthi", 123, "Jenny");
		StudentModel stuDetails2 = new StudentModel("Jai Teja", 124, "Karthick");
		StudentModel stuDetails3 = new StudentModel("Uma", 125, "Kumar");
		StudentModel stuDetails4 = new StudentModel("Prasad", 126, "Hima");

		StudentModel[] model1 = { stuDetails1, stuDetails2 };
		StudentModel[] model2 = { stuDetails3, stuDetails4 };

		DepartmentCollege departmentCollege1 = new DepartmentCollege(100, "E.C.E", model1);
		DepartmentCollege departmentCollege2 = new DepartmentCollege(100, "E.E.E", model2);

		StudentModel[] arr = departmentCollege1.getStudentDet();
		StudentModel[] arr1 = departmentCollege2.getStudentDet();

		for (int i = 0; i < model1.length; i++) {

			System.out.println(arr[i].getStdName());

		}

		for (int i = 0; i < model2.length; i++) {

			System.out.println(arr1[i].getStdName());

		}

	}
}
