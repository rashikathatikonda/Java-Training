package serializationdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) {

//		Employee emp = new Employee(1, "Markn", 1500, "AA2043");
//		System.out.println(emp);
//		Employee emp2 = new Employee(2, "Toney", 3000, "JAR077");
//		System.out.println(emp2);

//		SerializationDemo();
		SerializationDemoSimplified();

		DeserializationDemo();
		
		
	}

	private static void DeserializationDemo() {
		
		//try-with block
		try (FileInputStream fis = new FileInputStream("C:\\Users\\rchappidi\\supfiles\\emp.scr");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			Employee emp = (Employee) ois.readObject();
			System.out.println("Object Deserialized-"+emp);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void SerializationDemo() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		// try block
		try {
			fos = new FileOutputStream("C:\\Users\\rchappidi\\supfiles\\emp.scr");
			oos = new ObjectOutputStream(fos);

			Employee emp1 = new Employee(1, "Markn", 1500, "AA2043");
			oos.writeObject(emp1);
			System.out.println("Object serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void SerializationDemoSimplified() {

		// try-with block //only objects with auto-close are use is try-with
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\rchappidi\\supfiles\\emp.scr");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			Employee emp1 = new Employee(1, "Monkey Grap", 10000, "MR200Q");
			oos.writeObject(emp1);
			System.out.println("Object serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Employee implements Serializable {

	int id;
	String name;
	double salary;
	transient String aadhaarno;

	Employee(int id, String name, double salary, String aadhaarno) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadhaarno = aadhaarno;
	}

	@Override
	public String toString() {
		return this.id + "|" + this.name + "|" + this.salary + "|" + this.aadhaarno;

	}

}
