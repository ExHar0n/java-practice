package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String username, password;
		String validUsername = "Ex-Har0n@yandex.com";
		String validPassword = "WoodenSpoon123";
		System.out.println("Enter your username");

		username = scan.nextLine();
		System.out.println("Enter your password");
		password = scan.nextLine();
		if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successfull, Welcome!");
		} else if (!username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid username and invalid password");
		} else if (!validUsername.equals(username) && password.equals(validPassword)) {
			System.out.println("Invalid username ");
		} else if (username.equalsIgnoreCase(validUsername) && !password.equals(validPassword)) {
			System.out.println("Invalid password");

		}

	}
}