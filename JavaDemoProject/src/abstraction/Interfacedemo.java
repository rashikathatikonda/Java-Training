package abstraction;

public class Interfacedemo {
	
	public static void main(String[] args) {
		
		Tesla tesla= new Tesla();
		tesla.go();
		tesla.stop();
	}
}

interface Car{
	
	void go();
	void stop();
}

class Tesla implements Car{

	@Override
	public void go() {
		System.out.println("Camera on detection, auto-pilot started");
		
	}

	@Override
	public void stop() {
		System.out.println("Obstacle detected slowed and stopped");
		
	}
	
	
}