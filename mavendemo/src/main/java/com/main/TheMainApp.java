package com.main;

import com.model.ScientificCalcImpl;
import com.model.ScientificCalcInterface;

public class TheMainApp {

	public static void main(String[] args) {
		// InterfaceName var = new InterfaceImpl();
		
		ScientificCalcInterface myInterface = new ScientificCalcImpl();
		
		System.out.println("Addition " + myInterface.add(2, 4));
		System.out.println("Substraction " + myInterface.sub(4, 2));
		System.out.println("Multiplication " + myInterface.mul(2, 4));
		System.out.println("Division " + myInterface.div(4, 4));
		System.out.println("Division " + myInterface.mod(4, 2));
		
		
	}
}
