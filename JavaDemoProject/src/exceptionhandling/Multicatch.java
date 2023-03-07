package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Multicatch {
	
	public static void main(String[] args) {
		MulticatchDemo();
		
		try {
			checkedExceptionDemo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void MulticatchDemo() {
		
		try {
			String s = "23";
			int i = Integer.parseInt(s);
			System.out.println("Converted Integer ="+i);
			
			String s1= null;
			System.out.println("length of string ="+s1.length());
		}
		catch(NumberFormatException nfe) {
			System.out.println("NumberFormat Exception is:"+nfe.getMessage());
		}
		catch(NullPointerException ae) {
			System.out.println("NullPointer Exception is:"+ae.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception is :"+e.getMessage()+e.toString());
		}
	}
	
	private static void checkedExceptionDemo() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\rchappidi\\supfiles\\sample.txt");
	}

}
