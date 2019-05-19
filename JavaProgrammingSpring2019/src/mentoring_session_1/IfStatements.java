package mentoring_session_1;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		int time = 20;
		// condition ? if true: if false (TERNARY)
		System.out.println(time < 18 && time > 0 ? "Good afternoon" : "Good evening");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter score:");
		int score = scan.nextInt();
		System.out.println(score >= 64 ? "Passed" : "Failed");
	}

}
