package day28_arrays_practice;

public class Practice {

	public static void main(String[] args) {

		int[][] nums = { { 10, 20 }, { 20, 30, 40, 50 }, { 100, 200, 400 }, { 555, 333, 111, 444, 666, 78 } };
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
		}
		System.out.println();
	}
}
