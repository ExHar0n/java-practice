package day18_java_while_loops;

import java.util.Scanner;

public class EnterPincode {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;
		
		int pincode = 0;
		while(pincode != secretPincode) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
		}
		System.out.println("Correct pincode");
	}
	
}
