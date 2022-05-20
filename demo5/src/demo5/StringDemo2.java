package demo5;

public class StringDemo2 {
public static void main(String[] args) {
	String str1 = new String("Happy");
	String str2 = new String("Happy");
	System.out.println("Length of the string 1 : "+str1.length());
	System.out.println("Length of the string 2 : "+str2.length());
	
	if (str1 == (str2)) { // This will go through Memory Address
		System.out.println("Same");
	}
	else
	{
		System.out.println("Not Same");
	}

	if (str1.equals(str2)) { // This will go through data
		System.out.println("Same");
	}
	else
	{
		System.out.println("Not Same");
	}
	
	char[] c = str1.toCharArray();
	//char[] b= 
	
	for (int i = c.length; i >=0; i--) {
		System.out.println();
	}
		
	}

}

