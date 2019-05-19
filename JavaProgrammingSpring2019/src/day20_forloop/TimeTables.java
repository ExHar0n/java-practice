package day20_forloop;

import java.util.Scanner;

public class TimeTables {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();

		if (num < 1 || num > 10) {
			System.out.println("Invalid input");
			return; // System.exit(0);
		}

		for (int i = 1; i < 10; i++) {
			switch (num) {
			case 1:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 2:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 3:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 4:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 5:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 6:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 7:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 8:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 9:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			case 10:
				System.out.println(num + " x " + i + " = " + (num * i));
				break;
			}
		}

	}

}
