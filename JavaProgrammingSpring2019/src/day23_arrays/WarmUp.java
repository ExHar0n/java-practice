package day23_arrays;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 50; i++) {
			if (i % 20 == 0) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
}
