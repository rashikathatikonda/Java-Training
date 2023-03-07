package innerclasses;

public class InnerclassesDemo {
	
	public static void main(String[] args) {
		ElectronicDevice.poweron();
		
		ElectronicDevice.Chip.displaybrand();
		
		ElectronicDevice.Chip chip = new ElectronicDevice.Chip();
		chip.specs();
		
		ElectronicDevice laptop= new ElectronicDevice();
		
		ElectronicDevice.Processor proc = laptop.new Processor();
		proc.getVoltage();
		
		ElectronicDevice.Processor.core();
		
		laptop.shutdown();
	}
	
}
class ElectronicDevice{
	
		static void poweron() {
			System.out.println("Device powered on ...");
		}
		
		void shutdown() {
			System.out.println("Device power off..//");
		}
	
	//static inner class
	static class Chip{
		static void displaybrand() {
			System.out.println("From Yonko...");
		}
		
		void specs() {
			System.out.println("Specifications for this chip...");
		}
	}
	
	//non-static inner class
	class Processor{
		static void core() {
			System.out.println("Octa-core processor..");
		}
		
		void getVoltage() {
			System.out.println("Display voltage on the processor..");
		}
	}
}
