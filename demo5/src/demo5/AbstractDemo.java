package demo5;

public class AbstractDemo {
	public static void main(String[] args) {
		 // create object == initiate
		
		MyClassChild child = new MyClassChild();
		child.absVar = 100;
		child.childVar = 200;
		child.childDisplay(); // parent method
		child.ParentDisplay();
		
		
	}
}
