package inheritance;

public class Methodoverride {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.fuel();
		Bike bike = new Bike();
		bike.fuel();
	}
} 

class Vehicle{
	void fuel() {
		System.out.println("fuel");
	}
}
class Bus extends Vehicle{
	void fuel() {
		super.fuel();
		System.out.println("Diesel");
	}
}
class Car extends Vehicle{
	void fuel() {
		System.out.println("Petrol");
	}
}
class Bike extends Vehicle{
	//default constructor injected by compiler to create a object
	//if parent as custom constructor even child should have one
}
