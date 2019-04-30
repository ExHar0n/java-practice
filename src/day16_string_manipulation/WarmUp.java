package day16_string_manipulation;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter url:");
		String url = scan.next();
		String extension, domain;
		int firstDot, secondDot;

		if (url.startsWith("www.")) {
			System.out.println(true);
		}else {
			System.out.println("Invalid url format");
			return;
		}
		
		firstDot = (url.indexOf("."));
		secondDot = (url.lastIndexOf("."));
		
		/*
		 * if (url.charAt(url.length() - 4) == '.'){
		 * 	##################################
		 * }
		 */
		
		domain = (url.substring((firstDot + 1), secondDot));
		System.out.println("Domain is: " + domain);
		extension = (url.substring(secondDot + 1));
		System.out.println("Extension is: " + extension);
		
		
		
	}

}
