package demo2;

public class MainDemo {
	public static void main(String[] args) {
		Department deparment = new Department(); // instantiation == create an object
		
		System.out.println(deparment); // memory address where object is created in heap
		
		deparment.world(20); // static data -> it will not take user data -> not a dynamic data; -> not preferrable
		System.out.println("Dept1 Value of a : "+deparment.hello());
		
		Department deparment2 = new Department();
		deparment2.world(30);
		System.out.println("Dep2 Value of a : "+deparment2.hello());
		
		//conditional statement
		if (deparment.hello()== deparment2.hello()){
			System.out.println("The values are same");
			
		} else {
			System.out.println("The values are not same");

		}
		
		deparment = null; // dereference 
		deparment2 = null;
		
	}

}
