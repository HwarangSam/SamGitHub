package day_20_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		
		Integer numbers[] = {5,1,2,3,4,5,6,7,8,9,1,2,3,4};		//has to be wrapped to be used as object type
		
		ArrayList <Integer> nums = new ArrayList <>(Arrays.asList(numbers));  //convert array to ArrayList
		
		ArrayList<Integer> uniqueList = new ArrayList<>();
		
		for (int i = 0; i < nums.size(); i++) {
			if(!uniqueList.contains(nums.get(i))) {		//of the unique list DOES NOT contain cycle through nums
				uniqueList.add(nums.get(i));			//then add it to the uniqueList. CONTAINS is key.
			}
		}
		System.out.println(nums);
		System.out.println(uniqueList);
		
		//not sorted
		
		
		
	}

}
