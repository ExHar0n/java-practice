package day09_stringequals_conditionals;
import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		String userInput;
		String capital = "Ottawa";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		
		userInput = scan.next();
		
		if (userInput.equals(capital)) {
			System.out.println("Your answer is correct");
		}else {
			System.out.println("Your answer is incorrect! " + userInput + " is not the capital of Canada");
		}

	}

}
