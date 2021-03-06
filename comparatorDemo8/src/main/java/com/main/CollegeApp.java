package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.SortByAge;
import com.model.Student;

public class CollegeApp {

	public static void main(String[] args) {
		Student student1 = new Student(10, "Ten", 80, 80);
		Student student2 = new Student(30, "Thirty", 33, 90);
		Student student3 = new Student(20, "Twenty", 44,30);
		Student student4 = new Student(40, "Fouty", 90, 40);
		List<Student> students =  new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		
		Collections.sort(students, new SortByAge());
		
		for(Student student : students) {
			System.out.println(student.getStudentId()+" Id");
			System.out.println(student.getMark()+" Mark");
			System.out.println(student.getStudentName()+" Name");
			System.out.println(student.getStudentAge()+" age");
		}
		
		
		

	}

}
