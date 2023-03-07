package encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		Car car=new Car();
		car.setColour("Core Red Ra");
		System.out.println(car.getColour());
		car.setNoofWheels(4);
		System.out.println(car.getNoofWheels());
		
	}
}


class Car{
	private String colour;
	private int noofWheels;
	private boolean Customisable;

	public static String manufacturer="Tesla";
	
	public Car() {
		setNoofWheels(4);
		colour="Code Red Ra";
		Customisable=false;
	}

	public String getColour() {             //getter method
		return colour;
	}

	public void setColour(String colour) {  // setter method
		if(Customisable)
			this.colour = colour;
	}

	public int getNoofWheels() {
		return noofWheels;
	}

	public void setNoofWheels(int noofWheels) {
		this.noofWheels = noofWheels;
	}
	
	
	
	
	
}