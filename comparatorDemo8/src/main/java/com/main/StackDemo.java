package com.main;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.model.Student;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Student> students = new Stack<Student>();//LIFO
		System.out.println(students.capacity());// giving some space
		students.push(null);
		
		Queue<Student> queue = new LinkedList<Student>();//FIFO
		

	}

}
