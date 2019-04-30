package day11_logical_nestedif;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Vehicle Type:");
		int carType = keyboard.nextInt();
		
		System.out.println("Is it rush hour: yes | no");
		String rushHour = keyboard.next();
		
		
		
		boolean isRushHour;
		
		if(rushHour.equalsIgnoreCase("yes")) {
			isRushHour = true;
		}else {
			isRushHour = false;
		}
		System.out.println(isRushHour);
	}

}
