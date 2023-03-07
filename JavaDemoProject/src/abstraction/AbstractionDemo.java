package abstraction;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		BMWThreeSeries b3= new BMWThreeSeries();
		b3.start();
		b3.accelarate();

		BMWFiveSeries b5=new BMWFiveSeries();
		b5.start();
		b5.accelarate();
		
		BMW bmw= new BMWThreeSeries();
		bmw.start();
		bmw.accelarate();
	}
	
}

abstract class BMW{
	
	void start() {
		System.out.println("BMW Started...");
	}
	
	abstract void accelarate();
	
}

class BMWThreeSeries extends BMW{

	@Override
	void accelarate() {
		System.out.println("3x acceleration...");
		
	}
	
}

class BMWFiveSeries extends BMW{
	
	@Override
	void accelarate() {
		System.out.println("5x acceleration");
	}
}

//interface remote{  // in "INTERFACE" all methods are abstract
//	void start();
//	void switchoff();
//}