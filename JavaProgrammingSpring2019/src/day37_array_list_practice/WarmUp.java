package day37_array_list_practice;

import java.util.*;

public class WarmUp {

	public static void main(String[] args) {
	
		ArrayList<String> Shopping = new ArrayList<>();
		Shopping.add("Item1");
		Shopping.add("Item2");
		Shopping.add("Item3");
		Shopping.add("Item4");
		Shopping.add("Item5");
		Shopping.add("Item6");
		int count = Shopping.size();
		System.out.println("Total count: " + count);							//print number of items
		System.out.println(Shopping.toString());								// print all items in single line
		System.out.println(Shopping.get(0) + "|" + Shopping.get(count - 1)); 	//print first and last index
		
		Shopping.remove("Item3");
		System.out.println(Shopping.toString());
		Shopping.remove(0);
		System.out.println(Shopping.toString());
		
		for(String item : Shopping) {
			System.out.println(item);
		}
		
		//remove all items at once
		Shopping.clear();
		System.out.println(Shopping.toString());
	}

}
