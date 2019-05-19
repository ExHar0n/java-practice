package day15_string_manipulation;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		String smile;
		Scanner scan = new Scanner(System.in);
		smile = scan.nextLine();

		if (smile.length() != 2) {
			System.out.println("Invalid emoji");
			return;		//stop execution
		} else if ((smile.charAt(0)) == ':') {
			if (smile.charAt(1) == ')') {
				System.out.println("smile");
			} else if (smile.charAt(1) == '(') {
				System.out.println("sad");
			} else if (smile.charAt(1) == '/') {
				System.out.println("upset");
			} else if (smile.charAt(1) == 'p') {
				System.out.println("playfull");
			} else if (smile.charAt(0) == ';') {
				if (smile.charAt(1) == ')') {
					System.out.println("wink");
				} else if (smile.charAt(1) == '0') {
					System.out.println("surprised");
				}else {
					System.out.println("Invalid emoji");
				}
			}
		}
		
	}

}
