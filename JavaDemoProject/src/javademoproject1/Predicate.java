package javademoproject1;
public class Predicate {
  public static void main(String[] args) {
	  Predicate<Integer> gt5=(i)->(i>5);
	  Predicate<Integer> isEven=(i)->(i%2==0);
	  int[] y= {1,2,3,4,5,6,7,8,9,10};
	  m1(gt5.and(isEven),y);
  }
static void mt(Predicate<Integer> p,int[] x) {
	for(int i:x) {
		if(p.test(i)) {
			System.out.println(i);
		}
	}
}
}