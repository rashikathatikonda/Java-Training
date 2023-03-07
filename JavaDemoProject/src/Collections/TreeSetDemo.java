package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {
	
	public static void main(String[]args) {
		
		Set<Integer> intset = new TreeSet<Integer>();
		intset.add(3);
		intset.add(234);
		intset.add(69);
		intset.add(155);
		intset.add(115);
		intset.add(69);
		intset.add(0);
		
		System.out.println(intset); 
		
		Set<String> sset= new TreeSet<String>(new StringComparator());
		sset.add("Amz");
		sset.add("Boe");
		sset.add("Rolex");
		sset.add("Dili");
		sset.add("Cimbu");
		System.out.println(sset);
		
		Set<String> sset1= new TreeSet<String>();
		sset1.add("Raj");
		sset1.add("Banvar");
		sset1.add("Jali");
		sset1.add("Kati");
		sset1.add("Senu");
		System.out.println(sset1);
		
		Set<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(1, "Zavier", 1500, "AA2043"));
		employees.add(new Employee(2, "Booney", 3000, "JAR077"));
		employees.add(new Employee(3, "Roger", 10000, "MR200Q"));
		employees.add(new Employee(4, "Kid Eustass", 25000, "MR200V"));
		employees.add(new Employee(5, "Luffy", 10000, "MR200R"));
		System.out.println(employees);
		
		Set<Employee> employees1 = new TreeSet<Employee>(new EmployeeComparator());
		employees1.add(new Employee(1, "Bavier", 1500, "AA2043"));
		employees1.add(new Employee(2, "Zoney", 3000, "JAR077"));
		employees1.add(new Employee(3, "Roger", 10000, "MR200Q"));
		employees1.add(new Employee(4, "Kid Eustass", 25000, "MR200V"));
		employees1.add(new Employee(5, "Luffy", 10000, "MR200R"));
		System.out.println(employees1);
		
		
	}

}

//comparable = to PROVIDE Natural ordering
//comparator = to CHANGE Natural Ordering(Custom Ordering)
class StringComparator implements Comparator<String>{
	
	@Override
	public int compare(String str1,String str2) {
		int l1=str1.length();
		int l2=str2.length();
		if(l1<l2) {
			return -1;
		}else if(l1>l2) {
			return 1;
		}else {
		return str1.compareTo(str2);//return 0; then Treeset will think 0 as Indication of Duplicate
		}
	}
	
	
}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	transient String aadhaarno;
	
	Employee (int id, String name, double salary, String aadhaarno){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.aadhaarno=aadhaarno;
	}
	 
	@Override
	public String toString() {
		return this.id+"|"+this.name+"|"+this.salary+"|"+this.aadhaarno;
	}
	
	@Override
	public int compareTo(Employee o) {
//		return this.id < o.id ? -1 :this.id > o.id ? 1:0;//reorder on ID
		
		int tl=this.name.length();
		int ol=o.name.length();
		return tl < ol? -1 : tl >ol ? 1 : this.name.compareTo(o.name);//reorder by Name Length
		
//		return this.name.compareTo(o.name);//reorder by Natural Order
		
	}
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}

	
}