package tip_calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
    	int n = 0;
    	int x = 1;
    	int num = 4;
	      for(int i = 0; i < nums.length; i++){
	    	int temp = nums[n];
	    	nums[num] = temp;
	        nums[i] = nums[nums.length - x];
	        n++;
	        x++;
	      }
	    
	    
	    //Do not change below statement:
	    System.out.println(Arrays.toString(nums));
		
	}

}
