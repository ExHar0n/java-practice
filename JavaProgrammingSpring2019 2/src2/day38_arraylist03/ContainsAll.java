package day38_arraylist03;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {

	public static void main(String[] args) {
		
		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10);nums1.add(20);nums1.add(30);nums1.add(40);nums1.add(50);
		
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20);nums2.add(10);nums2.add(40);
		
		if(nums1.containsAll(nums2)) {
			System.out.println("Nums1 contains all nums2");
		}else {
			System.out.println("Nums1 does not contains all nums2");
		}
		
		
	}

}
