package com.main;

import java.util.Scanner;

public class CommandLineArg {

	public static void main(String[] args) {
		/*
		 * System.out.println(args[0]); System.out.println(args[1]+12);
		 * 
		 * //convert string to int -> By using wrapper class
		 * 
		 * int val = Integer.parseInt(args[1]); System.out.println(val + 100);
		 * 
		 * float floatVal = Float.parseFloat(args[3]);
		 * System.out.println(floatVal+100.50);
		 */
		
		//Scanner
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an emplId");
		int emplId = input.nextInt();
		System.out.println(emplId);
		System.out.println("Enter Employee name");
		String name = input.next();
		System.out.println("Employee name is " + name);
		System.out.println("Enter Employee Salary");
		float salary = input.nextFloat();
		System.out.println("Employee salary is " + salary);
		


	}

}
