
package javaprogs;

public class Flow {
	/*public Flow() {
		System.out.println("constructor");
	}*/
	
	static {
		System.out.println("static block");
	}
	{
	System.out.println("na-static block");
	}
	public static void main(String[] args) {
		System.out.println("main block");
		new Flow();
		new Flow();
		
		linkflow lf=new linkflow();
		System.out.println(linkflow.k);
		System.out.println(lf.acc);
	}
}
