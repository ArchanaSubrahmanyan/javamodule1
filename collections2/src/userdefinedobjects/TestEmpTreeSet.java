package userdefinedobjects;

import java.util.TreeSet;

public class TestEmpTreeSet {
public static void main(String[] args) {
		
		TreeSet <Employee> empTree= new TreeSet<Employee>();
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"Research",40000);
		
		
		Employee emp2 =new Employee("Jone Doe","Male",30,102,"Accounting",30000);
		
		Employee emp3 =new Employee("Jane Doe","Female",26,103,"Sales",45000);
		
		
		Employee emp4 =new Employee("Jason Doe","Male",28,104,"Research",50000);
		
		
		Employee emp5 =new Employee("John Doe","Male",24,101,"Research",40000);
		
		empTree.add(emp1);
		empTree.add(emp2);
		empTree.add(emp3);
		empTree.add(emp4);
		empTree.add(emp5);
		
		System.out.println(empTree.size());
		System.out.println(empTree);
	}

}
