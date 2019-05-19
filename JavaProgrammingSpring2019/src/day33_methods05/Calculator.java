package day33_methods05;

public class Calculator {

	public static void main(String[] args) {
		
		addVoid(2, 6);
		add(100, 200);
	}
	
	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
