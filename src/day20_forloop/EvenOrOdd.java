package day20_forloop;

public class EvenOrOdd {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		for (int j = 1; j <= 100; j++) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}

	}

}
