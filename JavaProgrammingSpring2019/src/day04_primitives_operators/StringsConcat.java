package day04_primitives_operators;

public class StringsConcat {
	public static void main(String[] args) {
		String firstName = "Alex";
		System.out.println("my name is " + firstName);
		String city = "zp";
		System.out.println("I was born in " + city + " city");
		
		String job = "SDET";
		String company = "Apple";
		System.out.println("I work as " + job + " in " + company);
	
		int zipcode = 22310;
		System.out.println("I live in " + zipcode + " zipcode");
		
		String city1, city2, city3;
		city1 = "Moscow";
		city2 = "Tashkent";
		city3 = "Kyiv";
		
		System.out.println("From " + city2 + " to " + city3 + " is 500$");
		System.out.println("From " + city1 + " to " + city2 + " is 550$");
		System.out.println("I have been to " + city2 + ", " + city1 + ", " + city3);
		
		String app = "Slack";
		System.out.println("We use " + app + " for messaging with Classmates");
	}
}
