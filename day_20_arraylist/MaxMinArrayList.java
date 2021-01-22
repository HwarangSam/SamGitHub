package day_20_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinArrayList {

	public static void main(String[] args) {

		Integer numbers[] = {5,1,2,3,4,5,6,7,8,9,1,2,3,4};		//has to be wrapped to be used as object type
		
		ArrayList <Integer> nums = new ArrayList <>(Arrays.asList(numbers)); 
		
		int max = nums.get(0);
		int min = nums.get(0);
		
		for (int i = 0; i < nums.size(); i++) {
			
			int currentNum = nums.get(i);		//unboxing
			if(currentNum > max) {
				max = currentNum;
			}
			if(currentNum < min) {
				min = currentNum;
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		//MAX MIN WITH SORTING
		Collections.sort(nums);		//sorting for ArrayList
		int maxSort = nums.get(nums.size()-1);
		int minSort = nums.get(0);
		System.out.println(maxSort);
		System.out.println(minSort);
		
		
	}

}
