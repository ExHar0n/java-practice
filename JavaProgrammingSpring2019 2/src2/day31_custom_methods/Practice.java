package day31_custom_methods;

public class Practice {

	public static void main(String[] args) {

		makePancakes();
		makePasta();
		cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");

	}

	public static void makePancakes() {
		System.out.println("~~PANCAKES RECIPE~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ENJOY YOUR DELICIOUS PANCAKES~~");
	}

	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		System.out.println("~~ DELICIOUS PASTA IS READY ~~");
	}

	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " Recipe~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~" + dish.toUpperCase() + " IS READY!~~");
	}

	public static void add(String ing) {
		System.out.println("Add " + ing);
	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}

	public static void fry(int minutes) {
		System.out.println("Fry it for " + minutes + " minutes");
	}

	public static void boil(int minutes) {
		System.out.println("Boil it for " + minutes + " minutes");
	}
}
