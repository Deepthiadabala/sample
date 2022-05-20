package com.main;

import com.model.Student;
import com.service.SameBranch;
import com.service.StudNameRoll;

public class StudentMain {
	public static void main(String[] args) {
		
		// creating Objects
		
		Student stuobj1 = new Student();
		Student stuobj2 = new Student();
		Student stuobj3 = new Student();
		Student stuobj4 = new Student();
		
		// Intializing objects
		
		stuobj1.setStdroll(25);
		stuobj1.setStdName("Deepthi");
		stuobj1.setBranch("E.C.E");
		
		stuobj2.setStdroll(29);
		stuobj2.setStdName("Jai Teja");
		stuobj2.setBranch("E.E.E");
		
		stuobj3.setStdroll(52);
		stuobj3.setStdName("Uma");
		stuobj3.setBranch("E.C.E");
		
		stuobj4.setStdroll(57);
		stuobj4.setStdName("Prasad");
		stuobj4.setBranch("E.E.E");
		
		// Creating arrays
		
		Student[] students = new Student[4];
		
		students[0] = stuobj1;
		students[1] = stuobj2;
		students[2] = stuobj3;
		students[3] = stuobj4;
		
		// verifying No. of same branch 
		
		SameBranch sameBranchObj = new SameBranch();
		
		int count = sameBranchObj.sameBranch(students,"E.C.E");
		
		System.out.println(count);
		
		//Printing Name giving rollno.
		
		StudNameRoll nameStd = new StudNameRoll();
		
		String name = nameStd.studNameRoll(students,57);
		
		System.out.println(name);
		
		
		
	}

}
