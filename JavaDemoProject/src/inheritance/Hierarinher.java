package inheritance;

public class Hierarinher {

	public static void main(String[] args) {
		Sun sun = new Sun();
		System.out.println(sun.energy());
		Blakhole blakhole = new Blakhole();
		System.out.println(blakhole.energy());
		Nebula nebula = new Nebula();
		System.out.println(nebula.energy());
	}
}

class Power{
	String energy() {
		return "Everyonehavetheirown";
	}
}

class Sun extends Power{
	String energy(){
		return "Nuclear Fision-fusion";
	}
}

class Blakhole extends Power{
	String energy() {
		return super.energy();
	}
}
class Nebula extends Power{
	String energy() {
		return "Radio-active material burst";
	}
}
