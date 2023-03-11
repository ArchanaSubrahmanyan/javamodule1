package anotherPack;
import source.Parent;

public class NonSubClass {

	public NonSubClass() {
		
		Parent p = new Parent();
		System.out.println(p.d); //here only public is visible
	}
}
