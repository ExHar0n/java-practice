package day30_methods02;

public class EtsySearch {

	public static void main(String[] args) {
		navigateToEtsy();
		searchForWoodenSpoon();
		printResult();
		

	}
	public static void navigateToEtsy() {
		System.out.println("Launch Chrome browser");
		System.out.println("Navigate to www.etsy.com");
	}
	public static void searchForWoodenSpoon() {
		System.out.println("Type 'wooden spoon' into search field");
		System.out.println("Click on search button");
	}
	public static void printResult() {
		System.out.println();
	}
}
