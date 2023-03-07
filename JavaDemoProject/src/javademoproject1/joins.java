package javademoproject1;

import java.util.Scanner;

public class joins {
public static void main(String[] args) {
	printmessage("sum of first n numbers");
	printmessage("enter a value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Calculator c=new Calculator(n);
	c.start();
	try {
		c.join();
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	printmessage("sum of first"+ n +"numbers="+c.getSum());
}
    private  static void printmessage(String message) {
    System.out.println(Thread.currentThread().getName()+"-"+message);
    long endtime=System.currentTimeMillis();
    System.out.println("total time taken");
}
} 
class Calculator extends Thread{
	int n;
	int sum;
	Calculator(int n){
		this.n=n;
	}
	public String getSum() {
		// TODO Auto-generated method stub
		return null;
	}
	public void run() {
		for(int i=1;i<=n;i++) {
			this.sum+=i;
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			  }
		}
	}
