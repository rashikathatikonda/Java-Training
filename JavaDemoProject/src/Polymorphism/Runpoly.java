package Polymorphism;

public class Runpoly {
	public static void main(String[] args) {
		Flowers o= new Bees(); ///Run time Polymorphism
		o.gen();
	}
}

class Flowers {
	void gen() {
		System.out.println("We gen fragnance");
	}
}
class Bees extends Flowers{
	//method Overridding
	void gen() {
		System.out.println("We gen honey");
	}
}