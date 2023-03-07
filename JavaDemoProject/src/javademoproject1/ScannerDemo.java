package javademoproject1;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		scannerdemo1();
		scannerdemo2();
	}
	private static void scannerdemo2() {
		int sum = 0;
		try (Scanner scanner1 = new Scanner(System.in)) {
			System.out.println("Enter a number (char to exti): ");
			while (scanner1.hasNextInt()) {
				int num = scanner1.nextInt();
				sum += num;
				System.out.println("Enter a number (char to exti): ");
			}
		}
		System.out.println("sum : " + sum);

	}

	private static void scannerdemo1() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter student id:");
			int id = scanner.nextInt();

			System.out.println("Enter Student name");
			String name = scanner.next();

			System.out.println("Enter Student score");
			double score = scanner.nextDouble();

			System.out.println("Student Details\nID: " + id + "\nname: " + name + "\nscore: " + score);
		}
	}
}
