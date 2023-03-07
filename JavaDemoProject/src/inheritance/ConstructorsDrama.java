package inheritance;

public class ConstructorsDrama {
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Planet planet = new Planet(1,2,3,4);
	}
}

class SSystem{
	int a,b;
	
	SSystem(int a, int b){
		this.a=a;
		this.b=b;
	}
}
class Planet extends SSystem{
	int c,d;
	 Planet(int a, int b, int c, int d){
		 //or  Bus(int c, int d)
		 //super(0,0);
		 
		 super(a,b);
		 this.c=c;
		 this.d=d;
	 }
}