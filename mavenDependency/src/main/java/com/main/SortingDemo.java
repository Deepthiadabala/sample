package com.main;

import java.util.Arrays;
import java.util.Iterator;

public class SortingDemo {

	public static void main(String[] args) {
		int[] intArray = {5,2,7,1,9};
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		char [] charArray = {'e','e','d','p'};
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		Arrays.sort(intArray);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
