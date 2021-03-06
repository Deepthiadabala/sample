import java.util.HashSet;
import java.util.Set;

public class GenericDemo {

	public static void main(String[] args) {
		//<> Type Safety -> allow one type of data
		
		Set <Integer> set= new HashSet();
		set.add(22);//wrapper class -> new integer(22)
		set.add(25);//wrapper class -> new integer(22)
		/*
		 * set.add(33.45f);//wrapper class -> new float(22) set.add("Happy");
		 */
		for (Integer integer : set) {//Only generics
			System.out.println(integer);
		}

	}

}
