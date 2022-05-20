package com.main;

import com.service.CalculaterService;
import com.service.CalculatorServiceImpl;

public class CalculatorMain {
	public static void main(String[] args) {
		
	
	CalculaterService calculaterService = new CalculatorServiceImpl();
	int a =10;
	int b = 20;
	int ans = calculaterService.add(b, a);
	System.out.println("Addition of two numbers" + ans);
	int ans1 = calculaterService.div(10, 0);
	
	int n1=0;
	int n2=0;
	try {
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		
	} catch ( java.lang.ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.err.println(e.getMessage());
	}
	catch (Exception e) {
		// TODO: handle exception
		System.err.println("Global Exception" + e.getMessage());
	}
	finally {
		System.out.println("Whether there is exception or not these lines will work");
	}
	
	
	int ans2 = calculaterService.add(n1, n2);
	System.out.println("Addition of two numbers" + ans2);
	
	
	}
}
