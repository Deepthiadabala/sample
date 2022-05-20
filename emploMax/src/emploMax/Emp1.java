package emploMax;
import java.util.*;

public class Emp1 {
	public static void main(String [] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.empId = 1023;
		emp1.empName = "Deepthi";
		emp1.salary = 250000.256;
		emp2.empId = 1023;
		emp2.empName = "Deep";
		//Scanner emp2.salary = new Scanner();
		emp2.salary = 290000.256;
		
		if (emp1.salary > emp2.salary) {
			System.out.println(emp1.empName+" is Earning highest salary");
		}
		else {
			System.out.println(emp2.empName+" is Earning highest salary");
		}

	}

}
