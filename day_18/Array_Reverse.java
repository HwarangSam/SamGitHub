package day_18;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Reverse {

	public static void main(String[] args) {
		
		int nums[] = {1,3,5,7,8};
		
		System.out.println(Arrays.toString(nums));
	
		int temp[] = new int [nums.length];		//temp array 
		int index = 0;							//temp array needs a temp index number too lol
		for (int i = nums.length-1; i >= 0; i--) {
			System.out.print(nums[i]);
			temp[index] = nums[i];
			index++;
		}
	}
}