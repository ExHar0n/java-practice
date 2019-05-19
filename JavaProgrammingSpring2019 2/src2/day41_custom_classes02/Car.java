package day41_custom_classes02;

public class Car {

	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		System.out.println("car make[" + make + "], model[" + model + "], color[" + color + "], current Speed["
				+ currentSpeed + "]");
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println(make + " is driving at " + currentSpeed + " following speed limit " + speedLimit);
		}else {
			System.out.println(make + " is driving at " + currentSpeed + " which is over the " + speedLimit);
		}
	}

}
