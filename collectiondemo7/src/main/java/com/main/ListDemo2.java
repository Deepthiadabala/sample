package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.model.Address;
import com.model.Department;

public class ListDemo2 {
	public static void main(String[] args) {
		Department department1 = new Department(10, "Development");
		Department department2= new Department(20, "Texting");
		Department department3= new Department(30, "cloud");
		
		
		List list = new ArrayList();
		System.out.println("list Size "+list.size());
		
		list.add(department1);
		list.add(department2);
		list.add(department3);
		
		Address address1 = new Address(123,"1st street","AP");
		Address address2 = new Address(124,"2st street","AP");
		
		list.add(address1);		
		list.add(address2);		
		
		
		System.out.println("list Size after add "+list.size());
		
		list.add(department3);
		System.out.println("list Size after Duplicate add "+list.size());
		

		list.remove(department3);
		System.out.println("list Size after Remove  "+list.size());
		
		
		/*
		 * for (Iterator iterator = list.iterator(); iterator.hasNext();) { Department
		 * object= (Department) iterator.next(); System.out.println(object.getDeptId());
		 * System.out.println(object.getDeptName());
		 * 
		 * }
		 */
		
		list.add(22); //-> wrapper class
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object= (Object) iterator.next();
			
			
			if (object instanceof Department) {
				Department new_name = (Department) object;
				System.out.println(new_name.getDeptId());
				System.out.println(new_name.getDeptName());
			}
			
			if (object instanceof Address) {
				Address new_name = (Address) object;
				System.out.println(new_name.getCity());
				System.out.println(new_name.getDoorNum());
				System.out.println(new_name.getStreet());
				
			}
			if (object instanceof Integer) {
				Integer new_name = (Integer) object;
				System.out.println("Integer value" + new_name);
				
			}
			
		}
	}

}
