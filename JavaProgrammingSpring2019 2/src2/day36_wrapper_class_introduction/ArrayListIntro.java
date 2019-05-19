package day36_wrapper_class_introduction;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//Create an arraylist
		String[] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> ints = new ArrayList<>();
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Alex");
		names.add("Mike");
		
		ints.add(1000);
		ints.add(2000);
		
		System.out.println(names);
		
		System.out.println(names.size());
		System.out.println(ints.size());
	}

}
