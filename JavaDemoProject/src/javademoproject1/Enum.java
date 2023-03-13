package javademoproject1;

public class Enum {
  public static void main(String[] args) {
	  PaymentType pt=PaymentType.DEBITCARD;
	  System.out.println(pt);
	  PaymentType[] values=PaymentType.values();
	  for(PaymentType paymentType:values) 
	  {
		  System.out.println(paymentType);
		  System.out.println(paymentType.ordinal());
		  System.out.println(paymentType.getFee());
	  }
}
}
enum PaymentType{
	DEBITCARD(5),
	CREDITCARD(10),
	CASH(1);
	int fee;
	PaymentType(int fee) {
		this.fee=fee;
	}
	public int getFee() {
		return this.fee;
	}
	
}
