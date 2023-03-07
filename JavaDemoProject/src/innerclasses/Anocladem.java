package innerclasses;

public class Anocladem {// =>ANOnomus CLAss DEMo
	
	public static void main(String[] args) {
		
		PrinterConnection con = PrinterDriver.getConnection();
		con.print();
	}

}

class PrinterDriver{
	
	static PrinterConnection getConnection() {
		
		PrinterConnection con = new PrinterConnection() {

			@Override
			public void print() {
				System.out.println("Printing...");
				
			}
			
		};// Anonomus in the Class
//		PrinterConnection pc = new MyPrinterConnection();
		
		return con;
	}
}

interface PrinterConnection{
	void print();
}

//class MyPrinterConnection implements PrinterConnection{
//	
//	@Override
//	public void print() {
//		System.out.println("MyPRinter Connection");
//	}
//}
