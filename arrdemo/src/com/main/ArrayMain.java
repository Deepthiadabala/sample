package com.main;

import com.service.ArrLogic;

public class ArrayMain {
public static void main(String[]args) {
	//int[] arr = {1,2,3,4};
	
	int[] arr =new int[4]; // if size is not given then it arises compilation error;
	
	arr[0]=10;
	arr[1]=20;
	
	
	
	  ArrLogic sum = new ArrLogic();
	  
	  System.out.println(arr.length); // Printing length
	  
	  int summer = sum.total(arr); // called total method from ArrLogic service
	  System.out.println("Total of array is" + summer);
	 
	
	
}
}
