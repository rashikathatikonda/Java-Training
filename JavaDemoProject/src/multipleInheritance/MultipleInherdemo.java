package multipleInheritance;

public class MultipleInherdemo {
	
	public static void main(String[] args) {
		
		TV tv= new TV();
		tv.powerOn();
		
		Monitor monitor = new Monitor();
		monitor.powerOn();
		
		DesktopComputer dc= new DesktopComputer();
		dc.start();
	}
	
}

class ElectronicDevice{
	void powerOn() {
		System.out.println("Device On");
	}
}

class TV extends ElectronicDevice{
	void powerOn() {
		System.out.println("TV On");
	}
}

class Monitor extends ElectronicDevice{
	void powerOn() {
		System.out.println("OS loading");
	}
}

class DesktopComputer implements I1, I2{

	public void start() {
		I1.super.start();
		I2.super.start();
	}
	
	
}