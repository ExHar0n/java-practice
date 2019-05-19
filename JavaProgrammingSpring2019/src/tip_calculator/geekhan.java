package tip_calculator;

import java.util.*;

public class geekhan {
	public static void main(String[] args) {

		System.out.println(reverse("idinahui"));

	}

	public static String reverse(String input) {
		String reverse = "";
		for (int i = 1; i < input.length() + 1; i++) {
			reverse += input.charAt(input.length() - i);
		}
		return reverse;
	}
}