package demo5;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer(5);
		System.out.println(stringBuffer.capacity());
		System.out.println(stringBuffer.length());

		stringBuffer.append("Happier");
		System.out.println(stringBuffer.capacity());
	}

}
