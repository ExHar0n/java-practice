package day41_custom_classes02;

public class Microwave {

	String brand;
	boolean isOn;
	
	public void turnOn() {
		if(isOn) {
			System.out.println(brand + " microwave is already on");
		}else {
			System.out.println("Turning on " + brand + " microwave");
			isOn = true;
		}
	}
	
	public void turnOff() {
		if(!isOn) {
			System.out.println(brand + " is already off");			
		}else {
			System.out.println(brand + " turning off");
			isOn = false;
		}
	}
	
	public void heat(String food) {
		if(isOn) {
			System.out.println("Heating " + food);
		}else {
			System.out.println("Microwave is off, cannot heat " + food);
		}
	}

}
