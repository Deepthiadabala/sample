package demo5;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = "Happy"; // String Literal declaration
		String str2 = "Good"; // String Literal declaration
		System.out.println("Length of the string 1 : "+str1.length());
		System.out.println("Length of the string 2 : "+str2.length());
		String str3 = "Happy";
		System.out.println("Length of the string 3 : "+str3.length());
		if (str1.equals(str2)) {
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}

	}

}
