package demo5;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder1 = new StringBuilder(5);
		System.out.println("Default Capacity " + stringBuilder1.capacity());
		System.out.println("Default Length " + stringBuilder1.length());
		stringBuilder1.append("Deepthi Adabala umaprasad");
		System.out.println("Capacity " + stringBuilder1.capacity());
		System.out.println("Length " + stringBuilder1.length());

	}

}
