package day19_loops;

import java.util.*;

public class WarmUp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("What is your balance?");
		double balance = s.nextDouble();
		
		System.out.println("What is transaction amount?");
		double transaction = s.nextDouble();
		int transactionCount = 0;
		
		while(balance > 0) {
			balance = balance - transaction;
			transactionCount++;
			System.out.println("Transaction # " + transactionCount);
			System.out.println("Your balance is: " + balance);
			if(balance<=50 && balance!=0 && balance>0) {
				System.out.println("You have a low balance!");
			}
			if(balance == 0) {
				System.out.println("Your balance is 0!");
				return;
			}
			System.out.println("What is transaction amount?");
			transaction = s.nextDouble();
		}
		System.out.println("You have insufficient funds.");
		

	}

}
