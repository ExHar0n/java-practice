package day36_wrapper_class_introduction;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("French");
		languages.add("Ukrainian");
		System.out.println("Number of values: " + languages.size());
		languages.add("Turkish");
		System.out.println("Number of values: " + languages.size());
		languages.remove(0);
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		System.out.println(languages);
	}

}
