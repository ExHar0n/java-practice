package day37_array_list_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		
		List<String> cars = new ArrayList<>();
		cars.add("Honda");
		
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		
		List<Double> prices = Arrays.asList(45.5, 2.4, 56.8, 105.2, 1040.6, 345.65, 2435.65, 67.87, 232.54, 560.32);
		System.out.println(prices.size());
		System.out.println(prices);
		double sum = 0;
		for(Double price : prices) {
			sum += price;
		}
		System.out.println(sum);
		
		List<Double> expensive = new ArrayList<>();
		
		for(double price : prices) {
			if(price > 100.0) {
				expensive.add(price);
			}
		}
		System.out.println(expensive);
		
	}

}
