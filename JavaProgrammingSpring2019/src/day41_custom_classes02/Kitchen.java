package day41_custom_classes02;

public class Kitchen {

	public static void main(String[] args) {
		
		Microwave mic = new Microwave();
		mic.brand = "LG";
		mic.turnOn();
		mic.heat("pizza with mushrooms & ham");
		mic.turnOff();
	}

}
