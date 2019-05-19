package day21_loops_practice;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		do {
			System.out.println("Please enter 2 numbers:");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum = num1+num2;
			
		}while(sum <= 100);
			System.out.println("Good numbers");

	}

}
