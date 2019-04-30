package tip_calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		int n = 1;
		// TODO: write your code below
		for (int i = 0; i < nums.length; i++) {
			if(i < 3) {
				int temp = nums[0];
				nums[0] = nums[n+3];
				nums[n+3] = temp;
			}else if( i > 3){
				nums[i] = nums[nums.length - n];
				n++;
			}
		}

		// Do not change below statement:
		System.out.println(Arrays.toString(nums));

	}
}
