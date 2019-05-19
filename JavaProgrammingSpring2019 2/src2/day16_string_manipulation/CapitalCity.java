package day16_string_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		
		String str = "Moscov is a capital of Russia";
		str = str.replace("Moscov", "Baku").replace("Russia", "Azerbaijan");   
		System.out.println(str);
		
		String email = "firsName_LastName@gmail.com";
		String company = "capitalone";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);										           

	}

}
