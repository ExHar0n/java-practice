package day30_methods02;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		stars();	//call the methods
		for (int i = 0; i < 100; i++) {
			stars();
		}
		
		introduce();
		
	}
	
		public static void stars() {
			for(int i = 0; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		public static void introduce() {
			Scanner scan = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = scan.next();
			System.out.println("Nice to meet you " + name);
		}
}
