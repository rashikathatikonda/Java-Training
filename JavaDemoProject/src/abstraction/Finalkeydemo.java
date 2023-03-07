package abstraction;

public class Finalkeydemo {
	
	public static void main(String[] args) {
		
		int x=5;
		x=4;
		
		B b = new B();
		b.dowork();
	}
}

class A{
	final void dowork() {  //if marked as final it can't be overridden
		System.out.println("A do some work");
	}
}

class B extends A{
	
}