package javademoproject1;

import java.util.ArrayList;


public class Garbagecollection {
  public static void main(String[] args) {
	  ArrayList<House> houses=new ArrayList<House>();
  for(int i=1;i<=100000;i++) {
	  houses.add(new House(i));
    new House(i);
	  }
	  
}
}
class House{
	int id;
	House(int id){
		this.id=id;
		Utils.printmessage("house created--"+id);
	}
	@override
	protected void finalize() throws Throwable{
		Utils.printmessage("house Destroyed--"+id);
	}
}