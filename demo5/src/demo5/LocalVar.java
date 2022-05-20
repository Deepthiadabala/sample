package demo5;

public class LocalVar {
public static void main(String[] args) {
	int a =10;
	System.out.println("Outside "+a);
	MyClass class1 = new MyClass();     
	
	System.out.println(class1.i); // instance variable
	System.out.println(MyClass.j);// static variable
}
}
