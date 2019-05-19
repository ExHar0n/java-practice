package day31_custom_methods;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {

		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray);
		printArray(new int[] { 22, 55, 77, 88 });
		int[] one = { 10, 2, 4, 6, 8 ,4 ,7, 8};
		int[] two = { 3, 6, 2, 8 , 4, 6, 7};
		System.out.println("");
		print2Arrays(one, two);
	}

	public static void printArray(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void print2Arrays(int[] arr, int[] nums) {
		if (arr.length > nums.length) {
			printArray(arr);
			System.out.println("");
			printArray(nums);
		} else {
			printArray(nums);
			System.out.println("");
			printArray(arr);
		}
	}
}
