package day18_java_while_loops;

import java.util.Scanner;

public class PinCodeV2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secretPincode = 4321;
		
		int pincode = 0;
		int attempts = 0;
		
		while(pincode != secretPincode && attempts <= 3) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
			
			attempts++;
			
			if(attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked");
				return;
			}
		}
			System.out.println("Acess granted");
	}

}
