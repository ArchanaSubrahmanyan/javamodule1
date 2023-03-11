package functionalinterfaces;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

//predicate is about condition
public class PredicateTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamil Nadu", "Telangana", "Kerala", "Karnataka");

		Predicate<String> p = (str) -> {
			return str.length() > 10;
		};
		System.out.println(p.test("Holla!")); //for a single string
		for (String str : strings)				//for multiple strings
			System.out.println(p.test(str));
		desiredLength(strings,p);
	}
	
	public static void desiredLength(List<String> strings,Predicate<String> p) {
		for(String str : strings)
			System.out.println(p.test(str));
	}

}
