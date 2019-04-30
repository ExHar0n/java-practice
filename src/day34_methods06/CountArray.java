package day34_methods06;

import java.util.Arrays;
import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		
		int[] arr = {15, 24, 32, 15, 45};
		
		System.out.println(findOccurences(arr, 15));
		System.out.println(findOccurences(getArray(), 0));
		for(;;) {
		System.out.println(Arrays.toString(getRandomArray(100)));
		}
		
	}
	
	public static int findOccurences(int[] array, int value) {
		int count = 0;
		for(int arr : array) {
			if(value == arr) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] getArray() {
		int[] arr = {15, 24, 56, 45, 23};
		return arr;
	}
	
	public static int[] getRandomArray(int size) {
		Random rand = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(101);
		}
		return arr;
	}

}
