package com.main;

import com.model.Employee;
import com.service.BusinessLogic;
//import com.service.EmpSameSal;
import com.service.EmpTotalSal;
import com.service.SameSalArr;
import com.service.SameSalCount;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		
		employee1.setEmpNo(10);
		employee1.setEmpName("Deepthi");
		employee1.setSalary(2600.0005f);
		
		employee2.setEmpNo(11);
		employee2.setEmpName("Jai Teja");
		employee2.setSalary(2600.0005f);
		
		employee3.setEmpNo(12);
		employee3.setEmpName("Prasad");
		employee3.setSalary(2600.0005f);
		
		Employee[] employees = new Employee[3];
		
		employees[0] =employee1;
		employees[1] =employee2;
		employees[2] =employee3;
		
		// searching employee through id
		
		BusinessLogic searchObj = new BusinessLogic();
		
		boolean boo = searchObj.searchById(employees, 15);
		
		if(boo) {
			System.out.println(boo);
		}
		else {
			System.out.println(false);
		}
		
		
		// getting total sum of employee salary
		
		EmpTotalSal sumObj = new EmpTotalSal();
		
		float sum = sumObj.totalSal(employees);
		
		System.out.println(sum);
		
		
		// getting employee details who are getting same salary
		
		SameSalCount count = new SameSalCount();
		
		int c = count.sameSalCount(employees,2600.0005f); // getting count of employees whose salary is equal
		//System.out.println(c);
		
		SameSalArr arr = new SameSalArr();
		
		int[] a = arr.sameSalArr(c,employees,2600.0005f);
		//System.out.println(a);
		
		System.out.println("The Employees who has same salary are :");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(
					"Employee name is " + employees[a[i]].getEmpName() + 
					" and his/her EmpNo is "+ employees[a[i]].getEmpNo()
					);
			
		}
		
		
	}

}
