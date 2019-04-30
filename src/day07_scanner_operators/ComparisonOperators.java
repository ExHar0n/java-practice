package day07_scanner_operators;

public class ComparisonOperators {
	public static void main(String[] args) {
				// == - equals
				// != - not equals
				// >  - greater than
				// >= - greater than or equals
				// <  - less then or equals
		
		//=
		System.out.println( 5 == 5);
		System.out.println( 50 == 5);
		int searchCount = 5000;
		System.out.println(searchCount == 5000);
		
		int expectedCount = 5010;
		System.out.println(expectedCount == searchCount);
		System.out.println( 5 != 5);
		
		int speedLimit = 55;
		int currentSpeed = 75;
		
		System.out.println(currentSpeed == speedLimit);
		boolean atLimit = currentSpeed == speedLimit;
		
		System.out.println("At speed limit: " + atLimit);
		
		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: " + overLimit);
		
		boolean underLimit = currentSpeed < speedLimit;
		System.out.println("Under limit: " + underLimit);
	}
}
