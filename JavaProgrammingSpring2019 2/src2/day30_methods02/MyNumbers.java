package day30_methods02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		
		showMe5Numbers();
		doPush10Ups();
		rangePrint();

	}
	
	public static void showMe5Numbers(){
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1000) + ", ");
		}
	}
	
	public static void doPush10Ups() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Pushup - " + i);
		}
		System.out.println("Time to rest");
	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 nums: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}else if(num1 > num2){
			for (int k = num1; k >= num2; k--) {
				System.out.print(k + " ");
			}
		}else {
			System.out.print(num1);
		}
		System.out.println();
	}
}
