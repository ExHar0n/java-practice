package day21_loops_practice;

import java.util.Scanner;

public class WarmUp2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many items did you purchased?");
		int count = scan.nextInt();
		double totalPrice = 0.0;
		String items = "";
		String allItems = "";
		
		for(int i = 1; i <= count; i++) {
			System.out.println("What is item " + i + "?");
			items = scan.next();
			allItems += items + ", ";
			System.out.println("Enter price for your item");
			double price = scan.nextDouble();
			totalPrice += price;
		}

		System.out.println("Your items: " + allItems);
		System.out.println("Total price: " + totalPrice);
		

	}

}
