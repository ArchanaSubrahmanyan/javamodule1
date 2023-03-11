package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Andhra Pradesh","Tamil Nadu","Telangana","Kerala","Karnataka");
		
		
		Function<String, Integer> f = (str) -> {
			return str.length();
		};
		
		
		Function<String,String> f1 =(str)->{
			return str.toUpperCase();
		};
		
		Function<String,String> f2=(str)->{
			return str.toLowerCase();
		};
		
		Function<String,String> f3=(str)->{
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			String strrev = sb.toString();
			return strrev;
		};
		
		printLength(strings,f);
		printUpperCase(strings,f1);
		printLowerCase(strings,f2);
		printReverse(strings,f3);
		
	}
		
		//for(String str:strings) {
			
		//	System.out.println(f.apply(str));
		//}
		
	//}
	//passing list and lambda function as argument
	public static void printLength(List<String> strings, Function<String,Integer> fRef) {
		for(String str:strings) {
			System.out.println(fRef.apply(str));
		}
	}
	public static void printUpperCase(List<String> strings,Function<String,String> fRef) {
		for(String str:strings) {
			System.out.println(fRef.apply(str));
		}
	}
	public static void printLowerCase(List<String> strings,Function<String,String> fRef) {
		for(String str:strings) {
			System.out.println(fRef.apply(str));
		}
	}
	public static void printReverse(List<String> strings,Function<String,String> fRef) {
		for(String str:strings) {
			System.out.println(fRef.apply(str));
		}
	}

}
