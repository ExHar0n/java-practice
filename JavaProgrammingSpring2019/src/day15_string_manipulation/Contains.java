package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {

		String email = "test@gmail.com";
		System.out.println(email.contains("@"));

		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		if (list.contains("apples")) {
			System.out.println("Apples are there!");
		} else {
			System.out.println("Let's add apples now.");
		}
		boolean hasEggs = list.toLowerCase().contains("eggs");
		System.out.println("Contains eggs: " + hasEggs);
		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumbers: " + hasCucumbers);

		email = "name@gmail.com";

		if (email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		} else if (email.contains("@gmail")) {
			System.out.println("Gmail account");
		} else if (email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Wooden spoon | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		
		String name = "Alex";
		if(name.contains("a") || name.contains("e")) {
			System.out.println("Yeah, 'a' or 'e' is present");
		}else {
			System.out.println("No, 'a' or 'e' is not present");
		}

	}
}