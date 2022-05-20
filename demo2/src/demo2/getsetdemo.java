package demo2;

public class getsetdemo {
	public static void main(String[] args) {
		Department deparment = new Department(); // instantiation == create an object
		
		System.out.println(deparment); // memory address where object is created in heap
		
		deparment.setDeptId(20); // static data -> it will not take user data -> not a dynamic data; -> not preferable
		System.out.println("Dept1 Value of a : "+deparment.getDeptId());
		
		Department deparment2 = new Department();
		deparment2.setDeptId(30);
		System.out.println("Dep2 Value of a : "+deparment2.getDeptId());
		
		//conditional statement
		if (deparment.getDeptId()== deparment2.getDeptId()){
			System.out.println("The values are same");
			
		} else {
			System.out.println("The values are not same");

		}
		
		deparment = null; // dereference 
		deparment2 = null;
		
	}
}
