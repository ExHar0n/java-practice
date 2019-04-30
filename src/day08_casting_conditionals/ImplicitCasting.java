package day08_casting_conditionals;

public class ImplicitCasting {

	public static void main(String[] args) {

		short shortValue = 3455;
		int intValue = shortValue;
		// (int)shortValue - optional

		System.out.println("int value " + intValue);

		double price = 345;
		System.out.println("price after casting: " + price);
	}

}
