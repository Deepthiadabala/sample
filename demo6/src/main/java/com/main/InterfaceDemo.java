package com.main;

import com.model.InterfaceTwo;
import com.model.MyClassImpl;

public class InterfaceDemo {

	public static void main(String[] args) {
		//InterfaceName var = new InterfaceImpl
		/*
		 * InterfaceOne interfaceOne = new MyClassImpl(); int k = interfaceOne.add(3,
		 * 4);
		 */
		//System.out.println("addition " + k);
		InterfaceTwo interfaceTwo = new MyClassImpl();
		int h = interfaceTwo.sub(12, 6);
		interfaceTwo.sub(9, 3);
		System.out.println(h);
		MyClassImpl myClassImpl = new MyClassImpl();
		System.out.println(myClassImpl.add(12, 13));
		System.out.println(myClassImpl.sub(12, 13));

	}

}
