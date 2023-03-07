package Polymorphism;


//Complie Time Polymorphism

public class Compliepoly {
	public static void main(String[] args) {
		A o = new A();
		o.you(21);
		o.you("Raja");
		o.you(5.7f);
	}
}

class A {
	//method Overloading
	void you(String s) {
		System.out.println("Your name lenght is "+s.length());
	}
	void you(int age) {
		System.out.println("Your age in seconds = "+(age*31556952));
	}
	void you(float ht) {
		if(ht>5.5) {
			System.out.println("U don't need stool");
		}
		else if(ht==5.5) {
			System.out.println("U Need stool");
		}
		else {
			System.out.println("Take others help");
		}
	}
}
