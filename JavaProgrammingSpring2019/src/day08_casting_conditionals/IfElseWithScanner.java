package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {

	public static void main(String[] args) {
		// passingPercantage = 65;
		// yourScorePercentage = take from scanner
		// check if you passed or failed

		Scanner input = new Scanner(System.in);

		int passingPercentage = 65;
		System.out.println("What is your score?");
		int yourScorePercentage = input.nextInt();

		if (yourScorePercentage >= passingPercentage) {
			System.out.println("you passed");
		} else {
			System.out.println("you failed");
		}

	}

}
