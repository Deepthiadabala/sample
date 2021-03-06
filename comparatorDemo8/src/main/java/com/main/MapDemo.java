package com.main;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 */

import com.model.Student;

public class MapDemo {

	public static void main(String[] args) {
		//Key, Value  ---> add == put, get;
		
		Student student1 = new Student(10, "Ten", 80, 80);
		Student student2 = new Student(30, "Thirty", 33, 90);
		Student student3 = new Student(20, "Twenty", 44,30);
		Student student4 = new Student(40, "Fouty", 90, 40);
		
		Map<String, Student> map = new HashMap<String, Student>();
		
		map.put("cc", student4);
		map.put("aa", student1);
		map.put("bb", student2);
		map.put("dd", student3);
		
		System.out.println("Display ");
		
		Student student = map.get("dd");
		
		System.out.println(student.getStudentId()+" Id");
		System.out.println(student.getMark()+" Mark");
		System.out.println(student.getStudentName()+" Name");
		System.out.println(student.getStudentAge()+" age");
		
		Map<Integer, Student> map2 = new HashMap<Integer, Student>();
		
		map2.put(student1.getStudentId(), student4); // auto boxing primitive to object -> Wrapper class
		//map2.put(new Integer(2), student1);
		map2.put(student2.getStudentId(), student1);
		map2.put(student3.getStudentId(), student2);
		map2.put(student4.getStudentId(), student3);
		
		System.out.println("Display ");
		Student studentTemp = map2.get(student2.getStudentId());
		
		System.out.println(studentTemp.getStudentId()+" Id");
		System.out.println(studentTemp.getMark()+" Mark");
		System.out.println(studentTemp.getStudentName()+" Name");
		System.out.println(studentTemp.getStudentAge()+" age");

	}

}
