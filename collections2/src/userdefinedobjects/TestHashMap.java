package userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		
		Employee emp1 =new Employee("John Doe","Male",24,101,"Research",40000);
		
		
		Employee emp2 =new Employee("Jone Doe","Male",30,102,"Accounting",30000);
		
		Employee emp3 =new Employee("Jane Doe","Female",26,103,"Sales",45000);
		
		
		Employee emp4 =new Employee("Jason Doe","Male",28,104,"Research",50000);
		
		
		Employee emp5 =new Employee("John Doe","Male",24,101,"Research",40000);
		
		ArrayList <Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		HashSet <Employee> empSet= new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		TreeSet <Employee> empTree= new TreeSet<Employee>();
		empTree.add(emp1);
		empTree.add(emp2);
		empTree.add(emp3);
		empTree.add(emp4);
		empTree.add(emp5);
		
		HashMap<String,Collection<Employee>> dataMap = new  HashMap<>();
		dataMap.put("empList", empList);
		dataMap.put("empSet", empSet);
		dataMap.put("empTree", empTree);
		
		System.out.println(dataMap);
		System.out.println();
		
		Collection<Employee> list = dataMap.get("empList");
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		Collection<Employee> set = dataMap.get("empSet");
		 iter= set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		Collection<Employee> Tree = dataMap.get("empTree");
		iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
