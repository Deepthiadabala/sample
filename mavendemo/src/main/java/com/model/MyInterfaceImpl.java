package com.model;

public class MyInterfaceImpl implements MyInterface{

	@Override // method is coming from another class
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		
		return a/b;
	}

	

}
