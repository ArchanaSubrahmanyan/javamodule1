package listdemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList <String> list = new LinkedList();
		
		list.add("Marker");
		list.add("Pencil");
		list.add("Book");
		list.add("Eraser");
		list.add("Sharpener");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2, "Sticky notes");
		System.out.println(list);
		
		Iterator <String> iter =list.descendingIterator(); 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ListIterator <String> listIter = list.listIterator();
		while(listIter.hasNext()) {
			String element = listIter.next();
			if(element.equals("Pencil")) {
				listIter.remove();
			}
			System.out.println(list);
					
			//System.out.println(listIter.hasNext());
			
		}
	}
	

}
