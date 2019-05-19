package day10_logical_operators_conditions;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) {
		
		int wonCoupons, candies, gumballs;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		wonCoupons = scan.nextInt();
		
		candies = (wonCoupons / 10);
		gumballs = ((wonCoupons % 10)/3);
		
		if(wonCoupons > 3) {
		System.out.println("Number of Candies: " + candies);
		System.out.println("Number of Gumballs: " + gumballs);
		}else {
			System.out.println("Not enough coupons");
		}

	}

}
