package javademoproject1;

public class runnable {
public static void main(String[] args) {
	Utils.printmessage("Begin main");
	ImageProcessor ip=new ImageProcessor();
	Thread t=new Thread(ip);
	t.start();
	Thread t1=new Thread(new Runnable() {
		@override
		public void run() {
			Utils.printmessage("do some work..");
		}
	});
	  Utils.printmessage("end main");		
	}
}
class ImageProcessor implements Runnable{
	@override
	public void run() {
		Utils.printmessage("processing an image");
	}
}
