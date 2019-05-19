package day08_casting_conditionals;

import java.util.Scanner;

public class VotingCalculator {
	public static void main(String[] args) {
		double votingAge = (int) 18;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age");
		int yourAge = keyboard.nextInt();
		int years = (int) (yourAge - votingAge);
		if (yourAge >= votingAge) {
			System.out.println("you are eligible to vote");
			System.out.println("you have been eligible to vote for " + years + " years");
		} else {
			System.out.println("you are not eliguble to vote");
			System.out.println("you still have " +years+ " more years to go");
		}
	}
 
}
