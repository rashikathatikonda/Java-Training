package exceptionhandling;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {

		divideByZeroDemo();
		
		StringParserDemo();
		
		nullPointerDemo();
	}
	
	
	private static void StringParserDemo() {
		try {
		String s = "hellow";
		int i = Integer.parseInt(s);
		System.out.println("Converted Intever ="+i);
		}catch(Exception sp) {
			System.out.println("Exception is :- "+sp.getMessage());
		}
		
	}
	
	private static void nullPointerDemo() {
		try {
		String s= null;
		System.out.println("length of string ="+s.length());
		}catch(NullPointerException np) {
			System.out.println("Exception is :-"+np.getMessage());
		}
	}
	private static void divideByZeroDemo() {
		int a, b;
		double c, d;
		System.out.println("Enter a number to divide..:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("a=" + a);
		System.out.println("enter 2nd number...:");
		b = scanner.nextInt();
		System.out.println("b=" + b);
		scanner.close();
		try {
			c = a / b;
			d = a % b;
			System.out.println(a + "/" + b + "=" + c);
			System.out.println(a + "%" + b + "=" + d);
		} catch (ArithmeticException ex) {
			System.out.println("Exception occurred."+ex.getMessage());
		}
		finally {
			System.out.println("End of calculation");

		}
	}
}