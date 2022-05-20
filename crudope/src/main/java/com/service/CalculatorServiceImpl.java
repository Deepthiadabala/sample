package com.service;

public class CalculatorServiceImpl implements CalculaterService {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		
		
		return num1+num2;
	}

	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		//return num1/num2;
		int a =0;
		try {
			a=num1/num2;
		} catch (java.lang.ArithmeticException ae) {
			// TODO: handle exception
			ae.printStackTrace();
		}
		return a;
		
	}

	@Override
	public int mod(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1%num2;
	}

}
