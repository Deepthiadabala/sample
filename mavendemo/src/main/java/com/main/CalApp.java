package com.main;

import com.model.Calculator;
import com.model.MyCalc;
import com.model.ScientificCalcImpl;

public class CalApp extends ScientificCalcImpl{
	public static void main(String[] args) {
		//abstractClassName var = new Inherited class
		MyCalc calc = new MyCalc(); // Abstraction
		calc.add(5, 6);
		calc.sub(6, 5);
		
	}

}
