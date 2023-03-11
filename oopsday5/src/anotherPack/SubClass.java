package anotherPack;

import source.Parent;

public class SubClass extends Parent {
 //if the accessing variables in different package , only protected and public is visible
	public SubClass() {
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
