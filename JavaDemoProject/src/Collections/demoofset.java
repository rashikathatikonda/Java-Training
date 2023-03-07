package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class demoofset {
	public static void main(String[] args) {
//		randomdemo();
		hashsetdemo();
	}
	private static void randomdemo() {
		Random random = new Random();
//		List<Integer> list = new ArrayList<Integer>();
		int x = random.nextInt(100); //arg specify the range of numbers
		
		System.out.println(x);
		
	}
	
	private static void hashsetdemo() {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(random.nextInt(1,10));
		}
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);               //removes duplicates and arrange in acending order
		
		Set<Integer> lhset = new LinkedHashSet<>(list);
		System.out.println(lhset);  		  //removes duplicates and arrange in same order(insertion order)
		
		Set<Integer> tset = new TreeSet<>(list);
		System.out.println(tset);
	}
}
