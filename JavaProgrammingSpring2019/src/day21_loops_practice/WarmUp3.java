package day21_loops_practice;

import java.util.Scanner;

public class WarmUp3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = "Java";
		
		for(int n = 3; n >= 0; n--) {
			String letter = word.substring(n, n+1);
			System.out.println(letter);
		}
		
		int start = 2;
		int end = 3;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));
		System.out.println(word2.substring(word2.length()-1));
	}

}
