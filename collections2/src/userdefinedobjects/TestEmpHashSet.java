package userdefinedobjects;

import java.util.HashSet;

public class TestEmpHashSet {

public static void main(String[] args) {
		
		HashSet <Employee> empSet= new HashSet<Employee>();
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"Research",40000);
		
		
		Employee emp2 =new Employee("Jone Doe","Male",30,102,"Accounting",30000);
		
		Employee emp3 =new Employee("Jane Doe","Female",26,103,"Sales",45000);
		
		
		Employee emp4 =new Employee("Jason Doe","Male",28,104,"Research",50000);
		
		
		Employee emp5 =new Employee("John Doe","Male",24,101,"Research",40000);
		
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet.size());
	}

}
