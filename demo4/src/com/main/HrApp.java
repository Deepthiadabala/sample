package com.main;

import com.model.Department;
import com.model.Employee;
import com.service.CountOfName;
import com.service.EmpNoDept;
import com.service.RetArrOfObj;

public class HrApp {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(123,"Deepthi",25000.23f); // Default Constructor
		Employee employee2 = new Employee(124,"Jai Teja", 26000.256f);
		Employee employee3 = new Employee(125,"Prasad",27000.23f);
		Employee employee4 = new Employee(126,"Uma",28000.23f);
		Employee employee5 = new Employee(123,"Deepthi",25000.23f);
		
		
		/*
		 * employee1.setEmpNo(123); employee1.setEmpName("Deepthi");
		 * employee1.setSalary(25000.46f);
		 * 
		 * 
		 * employee2.setEmpNo(123); employee2.setEmpName("Jai Teja");
		 * employee2.setSalary(27000.568f);
		 * 
		 * employee3.setEmpNo(126); employee3.setEmpName("Deep");
		 * employee3.setSalary(25000.4f);
		 * 
		 * 
		 * employee4.setEmpNo(129); employee4.setEmpName("Jai");
		 * employee4.setSalary(29000.568f);
		 */
		
		Employee [] employeeArray = new Employee[5];
		employeeArray[0] = employee1;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;
		employeeArray[3] = employee4;
		employeeArray[4] = employee5;
		
		
		Department department1 = new Department();
		department1.setDeptId(100);
		department1.setDeptName("Testing");
		department1.setEmployees(employeeArray);
		
		Employee[] emp = department1. getEmployees();
		
		
		
		
		//System.out.println(employeeArray.length);
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getEmpName());
		}
	
		
		
		
		
		
		
		
		
		
		/*
		 * // Department1 and Employee1 Details System.out.println("Department 1 id is "
		 * + department1.getDeptId());
		 * System.out.println("Department 1 name is "+department1.getEmployee().getEmpNo
		 * ());
		 * System.out.println("Department 1 Employee name is "+department1.getEmployee()
		 * .getEmpName()); System.out.println("Department 1 Employee id is "
		 * +department1.getDeptId());
		 * 
		 * // Department2 and Employee1 Details System.out.println("Department 2 id is "
		 * + department2.getDeptId());
		 * System.out.println("Department 2 name is "+department2.getEmployee().getEmpNo
		 * ());
		 * System.out.println("Department 2 Employee name is "+department2.getEmployee()
		 * .getEmpName()); System.out.println("Department 2 Employee id is "
		 * +department2.getDeptId());
		 */
		//Getting employees of Department
		
		/* 
		 * Search Employee Name by passing department to service layer (EmpNoDept) 
		 * Print Employee Name if empNo is matched*/
		
		
		EmpNoDept findName = new EmpNoDept();
		String nameOfEmp = findName.searchEmpNo(department1,124);
		
		System.out.println("Name of the Employee is "+ nameOfEmp);
		
		// Returning an single object
		
		
		
		
		// Returning counts of name repeated 
		
		CountOfName counting = new CountOfName();
		int c = counting.countOfName(department1,"Deepthi");
		
		System.out.println(c);
		
		// Returning array of objects
		
		RetArrOfObj retArrOfObj = new RetArrOfObj();
		int employees = retArrOfObj.retArrObj(employeeArray, c, "Deepthi");
		System.out.println(employees);
		
		/*
		 * for (int i = 0; i < employees.length; i++) {
		 * System.out.println(employees[i].getEmpName()); }
		 */
		
		
		
		
		
		
		
		
		



	}

}
