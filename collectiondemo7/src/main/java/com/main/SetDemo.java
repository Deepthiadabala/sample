package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Address;
import com.model.Department;

public class SetDemo {
	public static void main(String[] args) {
		Department department1 = new Department(10, "Development");
		Department department2= new Department(20, "Texting");
		Department department3= new Department(30, "cloud");
		
		
		Set set = new HashSet();
		System.out.println("Set Size "+set.size());
		
		set.add(department1);
		//set.add(department2);
		//set.add(department3);
		
		Set setOfAddress = new HashSet();
		
		Address address1 = new Address(123,"1st street","TN");
		Address address2 = new Address(124,"2st street","AP");
		
		setOfAddress.add(address1);		
		setOfAddress.add(address2);		
		
		department1.setAddress(setOfAddress);//in department I added address
		
		System.out.println("Set Size after add "+set.size());
		
//		set.add(department3);
		System.out.println("Set Size after Duplicate add "+set.size());
		

//		set.remove(department3);
		System.out.println("Set Size after Remove  "+set.size());
		
		
		/*
		 * for (Iterator iterator = set.iterator(); iterator.hasNext();) { Department
		 * object= (Department) iterator.next(); System.out.println(object.getDeptId());
		 * System.out.println(object.getDeptName());
		 * 
		 * }
		 */
		
//		set.add(22); //-> wrapper class
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Object object= (Object) iterator.next();
			
			
			if (object instanceof Department) {
				Department new_name = (Department) object;
				System.out.println(new_name.getDeptId());
				System.out.println(new_name.getDeptName());
				Set address = new_name.getAddress();
				for (Iterator iterator2 = address.iterator(); iterator2.hasNext();) {
					Address object2 = (Address) iterator2.next();
					System.out.println(object2.getCity());
				}
			}
			
			/*
			 * if (object instanceof Address) { Address new_name = (Address) object;
			 * System.out.println(new_name.getCity());
			 * System.out.println(new_name.getDoorNum());
			 * System.out.println(new_name.getStreet());
			 * 
			 * } if (object instanceof Integer) { Integer new_name = (Integer) object;
			 * System.out.println("Integer value" + new_name);
			 * 
			 * }
			 */
			
		}
	}

}
