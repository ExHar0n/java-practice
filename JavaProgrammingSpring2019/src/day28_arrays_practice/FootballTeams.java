package day28_arrays_practice;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {

		int[][] nums = new int[3][4];
		nums[0][0] = 100;
		nums[0][1] = 34534;
		nums[0][2] = 343242;
		nums[0][3] = 77242;

		nums[1][0] = 256;
		nums[1][1] = 64546;
		nums[1][2] = 257776;
		nums[1][3] = 999776;

		nums[2][0] = 1256;
		nums[2][1] = 164546;
		nums[2][2] = 1257776;
		nums[2][3] = 1999776;

		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));

		int[][] scores = { { 3, 5, 10 }, { 6, 4, 2, 10 } };
		
		System.out.println("Days played/Number of arrays: " + scores.length);
		System.out.println("Number of values in 1: " + scores[0].length);
		System.out.println("Number of values in 2: " + scores[1].length);
		
		int[][] values = new int[4][];
		values[0] = new int[] {34,23,5};
		
	}

}
