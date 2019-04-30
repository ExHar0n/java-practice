package day19_loops;

import java.util.*;

public class GuessANumber {

	public static void main(String[] args) {
		Random random = new Random();
		int secretNumber = random.nextInt(10000000);
		int guessNumber;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if(guessNumber < secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber != secretNumber);
		
		System.out.println("Bingo, Congratulations! You won!");
		
	}

}
