
package innerclasses;

public class Icd2 {
	public static void main(String[] args) {
		Car car= new Car("Blue");
		car.start();
		
		Car.VisualDetectionSys s= car.new VisualDetectionSys(16);
		s.displayfea();
		
		s.monitor();
	}
}

class Car{
	
		private static String model = "Tesla S Auto-Drive";
		
		private String colour;
		
		void start() {
			System.out.println("Car with "+colour+" color is started");
		}
		Car(String colour){
			this.colour=colour;
		}
		
	class VisualDetectionSys{
		
		private int noofcams;
		
		VisualDetectionSys(int num){
			this.noofcams=num;
		}
		
		//accessing outer class private variable in inner class
		void displayfea() {
			System.out.println("car model : "+Car.model);
			System.out.println("The car colour : "+Car.this.colour);
			System.out.println("Number of Camers : "+this.noofcams);
		}
		
		void monitor() {
			System.out.println("Oberservation started-_-");
			
			class Visionangles {
				int degrees;
				void degree() {
					System.out.println("Adjusting need the camera..."+degrees+" degrees");
				}
			}
			Visionangles vision =new Visionangles();
			vision.degree();
			
		}
	}
}
