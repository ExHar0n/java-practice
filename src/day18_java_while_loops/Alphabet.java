package day18_java_while_loops;

public class Alphabet {

	public static void main(String[] args) {

		char letter = 'a';

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
		}

		System.out.println("");

		char capitals = 'A';
		while (capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
		}

		System.out.println("");

		char reverse = 'z';
		while (reverse >= 'a') {
			System.out.print(reverse + " ");
			reverse--;
		}

		System.out.println();
		String letters = "";
		char myLetter = 'A';
		while (myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		String stairs = "*";
		//1) with a counter
		int num = 1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		//2) checking length()
		stairs = "*";
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";
		}

	}

}
