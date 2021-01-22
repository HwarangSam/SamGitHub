package homework;

import java.util.Arrays;

public class Move_Zeros {

	public static void main(String[] args) {
		//Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.
//		int[] array_nums = {0,0,1,0,3,0,5,0,6};
//
//		Original array:                                                        
//		0  0  1  0  3  0  5  0  6                                              
//		After moving 0's to the end of the array:                              
//		1  3  5  6  0  0  0  0  0 
		
		int [] array_nums = {0,0,1,0,3,0,5,0,6};
		
		int arr[] = new int[array_nums.length];   //new array with just the same length as original array but undefined values
		int index = 0;
		for (int i = 0; i < array_nums.length; i++) {
			if(array_nums[i] != 0) {
				arr[index] = array_nums[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));		//arr is the blank index. We are reassigning all non-zero elements in
														//array_nums to arr[] index number. Every successful non-zero element
														//will trigger the index number to ++ to continue filling out the array.
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
