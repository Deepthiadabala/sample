package com.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.model.Employee;

public class EmployeeSortMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(10, "Deep", 25, 1000);
		Employee employee2 = new Employee(20, "Jai", 20, 2000);
		Employee employee3 = new Employee(30, "Uma", 18, 3000);
		Employee employee4 = new Employee(40, "Prasad", 15, 4000);

		/*
		 * Employee[] employees = new Employee[4]; employees[0] = employee1;
		 * employees[1] = employee2; employees[2] = employee3; employees[3] = employee4;
		 */
		/*
		 * Arrays.sort(employees); for (int i = 0; i < employees.length; i++) {
		 * System.out.println(employees[i].getEmpName()); }
		 */

		Set setTree = new TreeSet();
		setTree.add(employee1);
		setTree.add(employee2);
		setTree.add(employee3);
		setTree.add(employee4);

		for (Iterator iterator = setTree.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			if (object instanceof Employee) {
				Employee new_name = (Employee) object;
				System.out.println(new_name.getEmpName());
			}

		}

	}

}
