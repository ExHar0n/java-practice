package day41_custom_classes02;

import java.util.*;

public class WarmUpWithList {

	public static void main(String[] args) {
		
		ArrayList<Integer>nums = new ArrayList<>();
		nums.add(5);
		nums.add(10);
		nums.add(20);
		
		System.out.println(doubleTheList(nums));
		List<Integer> myList = new ArrayList<>(nums);
		System.out.println(myList);
	}

	public static List<Integer> doubleTheList(List<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		return nums;
	}

}
