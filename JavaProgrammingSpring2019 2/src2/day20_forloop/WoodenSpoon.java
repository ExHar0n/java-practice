package day20_forloop;

public class WoodenSpoon {

	public static void main(String[] args) {

		String word = "Wooden Spoon";

		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i) + " ");
		}
		System.out.println("");
		for (int i = 0; i < word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				System.out.print(letter + ", ");
			}
		}

	}

}
