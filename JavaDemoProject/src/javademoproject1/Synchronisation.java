package javademoproject1;
public class Synchronisation {
public static void main(String[] args) {
	Monitor mon = new Monitor();
	Thread t1=new Thread(new )
}
}
class Worker implements Runnable{
	Monitor monitor;
	String name;
	Worker(Monitor monitor,String name){
		this.monitor=monitor;
		this.name=name;
	}
	@override
	public void run()
	monitor.displayGreeting(name);
}
class Monitor{
	public void displayGreeting(String message) {
		
		Utils.printmessage("how are you"+name+"?");
	}
}