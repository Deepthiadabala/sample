package demo2;

public class Department {
	private int a;
	private double salary;
	private int deptId;
	private String deptName;
	
	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double arg) {
		salary = arg;
	}
	
	public int hello(){
		return a; //get value
	}
	
	public void world(int arg) {
		// assign value
		a=arg; // set value
	}

	 void display() {
		// here display is method
		System.out.println("Access Modifier");
	}
}
