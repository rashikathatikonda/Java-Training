package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Utilsdemo {
	
	public static void main(String[] args) {
		
//		collectionsDemo();

		ArraysDemo();
	}

	private static void collectionsDemo() {
		List<String> mylist = new ArrayList<>();
		mylist.add("Boe");		
		mylist.add("Amz");
		mylist.add("Rolex");
		mylist.add("Dili");
		mylist.add("Cimbu");
		System.out.println(mylist);
		
		Collections.sort(mylist);//to sort in Natural Order
		System.out.println(mylist);

		int res= Collections.binarySearch(mylist, "Dili");
		System.out.println("Dili found at "+ res);
		
		int re1s= Collections.binarySearch(mylist, "Amz");
		System.out.println("Amz found at "+ re1s);
		
		Collections.sort(mylist, new MyComparator());//to sort in Reverse Order using Comparator
		System.out.println(mylist);
		
		Collections.reverse(mylist);//Reversing 
		System.out.println(mylist);
	}
	
	private static void ArraysDemo() {
		int[] a= {29,523,42,12};
		for (int i:a) 
			System.out.print(i+",");
		
		System.out.println();
		Arrays.sort(a);
		
		for (int i:a) 
			System.out.print(i+",");
		System.out.println();
		
		String[] s= {"G","R","A","P"};
		List<String> l =Arrays.asList(s);
		System.out.println(l);
	}

}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
