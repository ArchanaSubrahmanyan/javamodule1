package listdemo;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> bookSet = new HashSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java For Dummies");
		bookSet.add(null);
		bookSet.add(null);
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());//will not allow duplicate elements
		
		for(String book: bookSet) {
		
			System.out.println(book);
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {    //checking if there is a next element
			System.out.println(iter.next());
		}
	}

}
