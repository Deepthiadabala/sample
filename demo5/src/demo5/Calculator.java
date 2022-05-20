package demo5;

public abstract class Calculator extends Object{
	private int EmpNo;

	public Calculator(int empNo) {
		super(); // Inheriting object class
		EmpNo = empNo;
	}
	
	// method declaration no body
	// method definition (body)
	
	public abstract int add(int num1, int num2); // Declaration
	public int  sub(int num1, int num2) {
		return num1-num2;
	}

}
