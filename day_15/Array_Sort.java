package day_15;

import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) {


		int nums[] = {1,3,1,2,5,74,9,65,48,64,8};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
				
		Arrays.sort(nums);			//NOW we sort
		System.out.println();   //Let's get a line in between
		
		for (int i = 0; i < nums.length; i++) {		//for a loop the i is = to the index number of what's being looped
			System.out.print(nums[i] + ", ");
		}
		
		// Find the second largest number
		System.out.println();
		System.out.println(nums[nums.length-2]);  //minus 2 because the index number is already 1 less than the length number
		
		
		//NEXT
		
//		int nums1[] = {1,3,2,58,4,8,4};
//		int nums2[] = {1,3,2,58,4,8,4};
//		int nums3[] = {1,3,2,58,4,8};
//		int nums4[] = {1,2,3,4,4,8,58};
//		
//		System.out.println(Arrays.equals(nums1, nums2));
//		
//		Arrays.sort(nums2);
//		System.out.println(Arrays.equals(nums2, nums4));	//after sorting TRUE
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
