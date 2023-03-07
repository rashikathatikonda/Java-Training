package Arraydemo;

//WAP to replace the 5's that follow a 3, with 0
public class Task {
	
	public static void main(String[] args) {
		int a[] = {3,5,4,5,6,3,5,7};
		
		printArray(a);
		replace5(a);
		printArray(a);
	}

	private static void replace5(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(a[i]==5 && a[i-1]==3) {
				a[i]=0;
			}
		}
	}
private static void printArray(int[] a) {
		
		for (int i=0; i<a.length;i++) {
//		s+=a[i];
			System.out.print(a[i]+",");
		}
	System.out.println();
	}

}
