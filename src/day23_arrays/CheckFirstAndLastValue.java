package day23_arrays;

import java.util.Arrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {

		int[] lotteryNumbers = { 22, 41, 213, 21, 42, 22 };
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		int index = Arrays.binarySearch(lotteryNumbers, 213);
		System.out.println("Position: " + index);
		int[][] ducks = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		System.out.println(ducks.length);
	}

}
