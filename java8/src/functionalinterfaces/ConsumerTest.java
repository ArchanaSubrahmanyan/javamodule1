package functionalinterfaces;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamil Nadu", "Telangana", "Kerala", "Karnataka");
		
		//consumer takes input but does not return anything.In lambda function,print it just like void.
		Consumer<String> consumer =(str)->{
			System.out.println(str);
		};
		
		consumer.accept("I am doing great");
		for(String str:strings) {
			consumer.accept(str);
		}
		
		printStrings(strings,consumer);
	}
	
	public static void printStrings(List<String> strings , Consumer<String> c) {
		for(String str:strings) {
			c.accept(str);
		}
	}

}
