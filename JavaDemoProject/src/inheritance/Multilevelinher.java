package inheritance;

public class Multilevelinher {
	public static void main(String[] args) {
		me human = new me();
		human.gstat();
		human.mstat();
	}
}

//multi-level inheritance
class grandpa{
	grandpa(){
		System.out.println("grandpa born---die");
	}
	void gstat() {
		System.out.println("Senior in family");
	}
}

class father extends grandpa{
	father(){
		System.out.println("father born---die");
	}
}

class me extends father{
	me(){
		System.out.println("me born---die");
	}
	void mstat() {
		System.out.println("Young in family");
	}
}
