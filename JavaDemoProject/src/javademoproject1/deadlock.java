package javademoproject1;
public class deadlock {
  public static void main(String[] args) {
	
}
}
class FirstResource{
	void method1(SecondResource sr) {
		Utils.printmessage("Inside FirstResource.method1");
		try {
			Thread.slepp(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		Utils.printmessage("invoking SecondResource.method2");
		sr.method2();
	}
	public synchronised void method2() {
		Utils.printmessage("FirstResource.method1");
	}
}
class SecondResource{
	public.sync
}